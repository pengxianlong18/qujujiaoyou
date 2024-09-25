package cn.codefit.quju.system.service.biz.export.entity;

import cn.codefit.quju.base.model.BaseDtoBean;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * 小程序用户导出类
 */
@Data
public class AppletUserExportDto extends BaseDtoBean {
    /**
     * 微信用户昵称
     */
    @ExcelProperty(value = "用户昵称-xx")
    // 字符串的内容字体设置成30
    @ContentFontStyle(fontHeightInPoints = 50)
    // 字符串的头背景设置成粉红 IndexedColors.PINK.getIndex()
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
            fillForegroundColor = 14)
    private String nickname;

    /**
     * 微信用户性别 0:未知 1、男性 2、女性
     */
    @ExcelIgnore
//    @NumberFormat("#.##")
    private Integer gender;

//    private String genderStr;


    /**
     * 手机号
     */
    @ExcelProperty(value = "手机号", order = 0)
    /**
     * 宽度为50
     */
    @ColumnWidth(50)
    private String mobile;

    /**
     * 小程序用户唯一id
     */
    @ExcelProperty(value = "unionId")
    private String unionId;

    /**
     * 小程序用户唯一id
     */
    @ExcelProperty(value = "注册时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date createTime;


}
