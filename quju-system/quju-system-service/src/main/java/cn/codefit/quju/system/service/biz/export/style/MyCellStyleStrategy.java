package cn.codefit.quju.system.service.biz.export.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;

/**
 * @Description
 */
public class MyCellStyleStrategy extends HorizontalCellStyleStrategy {

    /**
     * 自定义策略
     *
     * @param headWriteCellStyle    头的策略
     * @param contentWriteCellStyle 内容的策略
     */
    public MyCellStyleStrategy() {
        super(buildHeadWriteCellStyle(), buildContentWriteCellStyle());
    }


    /**
     * 自定义头的策略
     *
     * @return
     */
    private static WriteCellStyle buildHeadWriteCellStyle() {
        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        // 背景设置为白色
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        WriteFont headWriteFont = new WriteFont();//字体
        headWriteFont.setFontHeightInPoints((short) 20);//字体大小
        headWriteFont.setFontName("黑体");//字体名称
        headWriteFont.setBold(true);//设置是否加粗
        headWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);//设置水平对齐方式
        headWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直对齐方式
        headWriteCellStyle.setWriteFont(headWriteFont);
        headWriteCellStyle.setBorderLeft(BorderStyle.THIN);
        headWriteCellStyle.setBorderBottom(BorderStyle.THIN); //下边框
        headWriteCellStyle.setBorderLeft(BorderStyle.THIN); //左边框
        headWriteCellStyle.setBorderRight(BorderStyle.THIN); //右边框
        headWriteCellStyle.setBorderTop(BorderStyle.THIN); //上边框
        return headWriteCellStyle;
    }

    /**
     * 自定义内容的策略
     *
     * @return
     */
    private static WriteCellStyle buildContentWriteCellStyle() {
        // 内容的策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        // 这里需要指定 FillPatternType 为FillPatternType.SOLID_FOREGROUND 不然无法显示背景颜色.头默认了 FillPatternType所以可以不指定
        contentWriteCellStyle.setFillPatternType(FillPatternType.SOLID_FOREGROUND);
        // 背景绿色
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        WriteFont contentWriteFont = new WriteFont();
        // 字体大小
        contentWriteFont.setFontHeightInPoints((short) 20);
        contentWriteCellStyle.setWriteFont(contentWriteFont);
        return contentWriteCellStyle;
    }


}
