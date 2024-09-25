package cn.codefit.quju.system.service.biz.export.entity;

import cn.codefit.quju.base.model.BaseDtoBean;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 圈子活动信息-导出类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasActivityExportDto extends BaseDtoBean {

    /**
     * 活动编号
     */
    @ExcelProperty(value = "活动编号")
    private String activityNo;
    /**
     * 用户唯一id
     */
    @ExcelProperty(value = "用户userId")
    private String userId;
    /**
     * 活动主题
     */
    @ExcelProperty(value = "活动主题")
    private String activityTheme;
    /**
     * 活动地址
     */
    @ExcelProperty(value = "活动地址")
    private String activityAddress;

    /**
     * 活动开始时间
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty("活动开始时间")
    private Date startTime;
    /**
     * 活动结束时间
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty("活动结束时间")
    private Date endTime;
    /**
     * 0、免费 1、在线支付 2、现场支付
     */
    //@ExcelIgnore-忽略的意思
    @ExcelIgnore
    private Integer costType;
    @ExcelProperty(value = "")
    private String costTypeStr;


    /**
     * 活动单人应支付金额(type为0的时候值为0.00)
     */
    @NumberFormat("#.##%")
    @ExcelProperty(value = "活动金额")
    private BigDecimal activityAmount;


}
