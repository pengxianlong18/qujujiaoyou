package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.model.dao.SysDictionaryMapper;
import cn.codefit.quju.system.model.po.SysDictionary;
import cn.codefit.quju.system.model.po.SysDictionaryExample;
import cn.codefit.quju.system.service.biz.SysDictionaryBizService;
import cn.codefit.quju.system.service.biz.dao.SysDictionaryBizMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class SysDictionaryBizServiceImpl implements SysDictionaryBizService {

    @Autowired
    private SysDictionaryMapper sysDictionaryMapper;
    @Autowired
    private SysDictionaryBizMapper sysDictionaryBizMapper;

    /**
     * 根据数据字典编码查询数据字典
     *
     * @param dictCode
     * @return
     */
    @Override
    public SysDictionary selectSysDictBydictCode(String dictCode) {
        SysDictionaryExample example = new SysDictionaryExample();
        SysDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andDictCodeEqualTo(dictCode);

        List<SysDictionary> list = sysDictionaryMapper.selectByExample(example);

        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 根据id查询数据字典
     *
     * @param id
     * @return
     */
    @Override
    public SysDictionary selectSysDictById(Long id) {
        SysDictionary item = sysDictionaryMapper.selectByPrimaryKey(id);
        return item;
    }

    /**
     * 更新数据字典
     *
     * @param sysDictionary
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSysDict(SysDictionary sysDictionary) {
        sysDictionary.setModifyTime(new Date());
        sysDictionary.setModifyUser(UserUtils.getUserId().toString());
        sysDictionary.setModifyUserName(UserUtils.getUsername());
        sysDictionaryMapper.updateByPrimaryKeySelective(sysDictionary);
    }

    /**
     * 根据字典编码删除数据字典
     *
     * @param dictCode
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteSysDictBydictCode(String dictCode) {
        SysDictionaryExample example = new SysDictionaryExample();
        SysDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andDictCodeEqualTo(dictCode);

        SysDictionary sysDictionary = new SysDictionary();
        sysDictionary.setIsDeleted(1);
        sysDictionaryMapper.updateByExampleSelective(sysDictionary, example);
    }

    /**
     * 校验字典编码是否可用
     *
     * @param dictCode 字典编码
     * @param dictId   字典id
     * @return
     */
    @Override
    public boolean checkDictByCode(String dictCode, Long dictId) {
        Map<String, Object> map = new HashMap<>();
        map.put("dictCode", dictCode);
        if (dictId != null) {
            map.put("noId", dictId);
        }
        int number = sysDictionaryBizMapper.checkDictByCode(map);
        return number > 0 ? true : false;
    }
}
