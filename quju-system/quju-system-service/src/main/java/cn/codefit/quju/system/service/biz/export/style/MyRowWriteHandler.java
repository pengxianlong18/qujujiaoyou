package cn.codefit.quju.system.service.biz.export.style;

import com.alibaba.excel.write.handler.RowWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

/**
 * 自定义行-Handler
 */
public class MyRowWriteHandler implements RowWriteHandler {

    @Override
    public void beforeRowCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Integer rowIndex, Integer relativeRowIndex, Boolean isHead) {

    }

    @Override
    public void afterRowCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Integer relativeRowIndex, Boolean isHead) {

    }

    /**
     * 合并数据内容中前两列
     *
     * @param writeSheetHolder
     * @param writeTableHolder
     * @param row
     * @param relativeRowIndex
     * @param isHead
     */
    @Override
    public void afterRowDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Integer relativeRowIndex, Boolean isHead) {
        if (!isHead) {
            //合并数据项中的每一行中的前两列
            //起始行号，终止行号， 起始列号，终止列号
            CellRangeAddress cellAddresses = new CellRangeAddress(row.getRowNum(), row.getRowNum(), 0, 1);
            writeSheetHolder.getSheet().addMergedRegion(cellAddresses);


            XSSFCellStyle style = (XSSFCellStyle) row.getSheet().getWorkbook().createCellStyle();
            style.setFillForegroundColor(IndexedColors.WHITE.getIndex());//设置背景颜色

            XSSFFont font = null;
            font = (XSSFFont) row.getSheet().getWorkbook().createFont();
            font.setFontName("黑体");
            font.setBold(false);
            font.setFontHeightInPoints((short) 11);//字体大小
            style.setFont(font);//设置字体
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderBottom(BorderStyle.THIN); //下边框
            style.setBorderLeft(BorderStyle.THIN); //左边框
            style.setBorderRight(BorderStyle.THIN); //右边框
            style.setBorderTop(BorderStyle.THIN); //上边框

            style.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直对齐方式
            style.setAlignment(HorizontalAlignment.LEFT);//设置水平对齐方式
            row.getCell(0).setCellStyle(style);

            XSSFCellStyle styleNoFirst = (XSSFCellStyle) row.getSheet().getWorkbook().createCellStyle();
            styleNoFirst.setFillForegroundColor(IndexedColors.WHITE.getIndex());//设置背景颜色

            XSSFFont fontNoFirst = null;
            fontNoFirst = (XSSFFont) row.getSheet().getWorkbook().createFont();
            fontNoFirst.setFontName("黑体");
            fontNoFirst.setBold(false);
            fontNoFirst.setFontHeightInPoints((short) 11);//字体大小
            styleNoFirst.setFont(fontNoFirst);//设置字体
            styleNoFirst.setBorderLeft(BorderStyle.THIN);
            styleNoFirst.setBorderBottom(BorderStyle.THIN); //下边框
            styleNoFirst.setBorderLeft(BorderStyle.THIN); //左边框
            styleNoFirst.setBorderRight(BorderStyle.THIN); //右边框
            styleNoFirst.setBorderTop(BorderStyle.THIN); //上边框
            styleNoFirst.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直对齐方式
            styleNoFirst.setAlignment(HorizontalAlignment.RIGHT);//设置水平对齐方式
            row.getCell(1).setCellStyle(styleNoFirst);
            row.getCell(2).setCellStyle(styleNoFirst);
            row.getCell(3).setCellStyle(styleNoFirst);

            row.setHeightInPoints((short) 14.4);//设置行高
        } else {
            if (relativeRowIndex == 0) {
                // : 2022/4/17 单独设置头部第一行的样式
                //处理第一行样式
                // 头的策略
                // 背景设置为红色
                row.setHeightInPoints((short) 30);//设置行高
                XSSFCellStyle style = (XSSFCellStyle) row.getSheet().getWorkbook().createCellStyle();
                style.setFillForegroundColor(IndexedColors.WHITE.getIndex());//设置背景颜色

                XSSFFont font = null;
                //样式存在字体对象时，使用原有的字体对象
                font = (XSSFFont) row.getSheet().getWorkbook().createFont();
                font.setFontName("黑体");
                font.setBold(true);
                font.setFontHeightInPoints((short) 14);//字体大小

                style.setFont(font);//设置字体
                style.setAlignment(HorizontalAlignment.CENTER);//设置水平对齐方式
                style.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直对齐方式
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN); //下边框
                style.setBorderLeft(BorderStyle.THIN); //左边框
                style.setBorderRight(BorderStyle.THIN); //右边框
                style.setBorderTop(BorderStyle.THIN); //上边框
                row.getCell(0).setCellStyle(style);
            } else if (relativeRowIndex == 6) {
                XSSFCellStyle style = (XSSFCellStyle) row.getSheet().getWorkbook().createCellStyle();
                style.setFillForegroundColor(IndexedColors.WHITE.getIndex());//设置背景颜色

                XSSFFont font = null;
                font = (XSSFFont) row.getSheet().getWorkbook().createFont();
                font.setFontName("黑体");
                font.setBold(true);
                font.setFontHeightInPoints((short) 12);//字体大小

                style.setFont(font);//设置字体
                style.setAlignment(HorizontalAlignment.LEFT);//设置水平对齐方式
                style.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直对齐方式
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN); //下边框
                style.setBorderLeft(BorderStyle.THIN); //左边框
                style.setBorderRight(BorderStyle.THIN); //右边框
                style.setBorderTop(BorderStyle.THIN); //上边框

                row.getCell(0).setCellStyle(style);
                row.getCell(1).setCellStyle(style);
                row.getCell(2).setCellStyle(style);
                row.getCell(3).setCellStyle(style);
                row.setHeightInPoints((short) 15.6);//设置行高
            } else {
                row.setHeightInPoints((short) 14.4);//设置行高
            }
        }

    }
}
