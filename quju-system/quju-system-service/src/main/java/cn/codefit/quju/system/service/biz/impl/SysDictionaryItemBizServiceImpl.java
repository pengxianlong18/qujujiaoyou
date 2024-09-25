package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.model.dao.SysDictionaryItemMapper;
import cn.codefit.quju.system.model.po.SysDictionaryItem;
import cn.codefit.quju.system.model.po.SysDictionaryItemExample;
import cn.codefit.quju.system.service.biz.SysDictionaryItemBizService;
import cn.codefit.quju.system.service.biz.dao.SysDictionaryItemBizMapper;
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
public class SysDictionaryItemBizServiceImpl implements SysDictionaryItemBizService {

    @Autowired
    private SysDictionaryItemMapper sysDictionaryItemMapper;
    @Autowired
    private SysDictionaryItemBizMapper sysDictionaryItemBizMapper;

    /**
     * 根据数据字典编码更新字典子项
     *
     * @param sysDictionaryItem
     * @param dictCode
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSysDictItemByDictCode(SysDictionaryItem sysDictionaryItem, String dictCode) {
        SysDictionaryItemExample example = new SysDictionaryItemExample();
        SysDictionaryItemExample.Criteria criteria = example.createCriteria();
        criteria.andDictCodeEqualTo(dictCode);

        sysDictionaryItem.setModifyTime(new Date());
        sysDictionaryItem.setModifyUser(UserUtils.getUserId().toString());
        sysDictionaryItem.setModifyUserName(UserUtils.getUsername());
        sysDictionaryItemMapper.updateByExampleSelective(sysDictionaryItem, example);

    }

    /**
     * 根据数据字典编码删除所有子项数据
     * @param dictCode
     */
    ;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteSysDictItemBydictCode(String dictCode) {
     /*   SysDictionaryItemExample example=new SysDictionaryItemExample();
        SysDictionaryItemExample.Criteria criteria=example.createCriteria();
        criteria.andDictCodeEqualTo(dictCode);*/

        SysDictionaryItem sysDictionaryItem = new SysDictionaryItem();
        sysDictionaryItem.setModifyTime(new Date());
        sysDictionaryItem.setModifyUser(UserUtils.getUserId().toString());
        sysDictionaryItem.setModifyUserName(UserUtils.getUsername());
        sysDictionaryItem.setIsDeleted(1);

        updateSysDictItemByDictCode(sysDictionaryItem, dictCode);
//        sysDictionaryItemMapper.updateByExampleSelective(sysDictionaryItem,example);
    }

    /**
     * 根据id查询数据字典子项最新详情
     *
     * @param id
     * @return
     */
    @Override
    public SysDictionaryItem selectSysDictItemById(Long id) {

        return sysDictionaryItemMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据字典字典编码查询字典子项信息
     *
     * @param itemCode
     * @return
     */
    @Override
    public SysDictionaryItem selectSysDictItemByItemCode(String itemCode) {
        SysDictionaryItemExample example = new SysDictionaryItemExample();
        SysDictionaryItemExample.Criteria criteria = example.createCriteria();
        criteria.andItemCodeEqualTo(itemCode);

        List<SysDictionaryItem> list = sysDictionaryItemMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 更新数据字典子项
     *
     * @param sysDictionaryItem
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSysDictItemById(SysDictionaryItem sysDictionaryItem) {
        sysDictionaryItem.setModifyTime(new Date());
        sysDictionaryItem.setModifyUser(UserUtils.getUserId().toString());
        sysDictionaryItem.setModifyUserName(UserUtils.getUsername());
        sysDictionaryItem.setIsDeleted(ConstantEnum.IS_DELETE_NO.getCode());
        sysDictionaryItemMapper.updateByPrimaryKeySelective(sysDictionaryItem);
    }

    /**
     * 根据主键删除数据字典子项
     *
     * @param id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteSysDictItemById(Long id) {
        sysDictionaryItemMapper.deleteByPrimaryKey(id);
    }

    /**
     * 校验子项只存在唯一默认值
     *
     * @param dictCode 字典编码
     * @param id       子项主键
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void checkSysDictItemDefault(String dictCode, Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("dictCode", dictCode);
        map.put("id", id);
        map.put("isDefault", Constant.IS_NO_DEFAULT);
        sysDictionaryItemBizMapper.checkSysDictItemDefault(map);
    }

    /**
     * 校验字典子项编码是否可用
     *
     * @param itemCode
     * @param itemId   子项主键
     * @return
     */
    @Override
    public boolean checkDictItemByCode(String itemCode, Long itemId) {
        Map<String, Object> map = new HashMap<>();
        map.put("itemCode", itemCode);
        if (itemId != null) {
            map.put("noId", itemId);
        }
        int number = sysDictionaryItemBizMapper.checkDictItemByCode(map);
        return number > 0 ? true : false;
    }
}
