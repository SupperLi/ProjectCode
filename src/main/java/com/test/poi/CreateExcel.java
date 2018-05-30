package com.test.poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout.Alignment;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "xiaobai",
					"xiaobai");

			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from sy_emp order by id");
			
			//从头开始创建一个新的XSSFWorkbook对象时
			XSSFWorkbook workbook = new XSSFWorkbook();
			//一张表格对象(表格卡)
			XSSFSheet sheet = workbook.createSheet("测试");
			//合并行及列
            //sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, 10));
            //创建行
			XSSFRow row = sheet.createRow(0);
			//设置行高度
            row.setHeight((short)500);
			//设置样式
            XSSFCellStyle cellStyle = workbook.createCellStyle();
			// 水平对齐	
			cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			// 垂直对齐
			cellStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			
			/*//创建字体对象
            XSSFFont styfont = workbook.createFont();
            //设置字体
            styfont.setFontHeightInPoints((short)24); //字体大小
            styfont.setFontName("楷体");
            styfont.setBoldweight(Font.BOLDWEIGHT_BOLD); //粗体
            styfont.setColor(HSSFColor.RED.index);    //颜色字
            //将字体加入至样式中
            cellStyle.setFont(styfont);*/
			
			//创建一个数据格子
			XSSFCell cell = row.createCell(0);
			//将样式应用至数据格子上
			cell.setCellStyle(cellStyle);
			
			//给数据格子设置值
			cell = row.createCell(0);
			cell.setCellValue("ID");
			cell = row.createCell(1);
			cell.setCellValue("姓名");
			cell = row.createCell(2);
			cell.setCellValue("学名");
			cell = row.createCell(3);
			cell.setCellValue("密码");
			
			int i = 1;
			while (rs.next()) {
				
				row = sheet.createRow(i);				
				cell = row.createCell(0);
				cell.setCellValue(rs.getInt("id"));
				cell = row.createCell(1);
				cell.setCellValue(rs.getString("empname"));
				cell = row.createCell(2);
				cell.setCellValue(rs.getString("empno"));
				cell = row.createCell(3);
				cell.setCellValue(rs.getString("pwd"));
				i++;
			}
		
			//输出流
			FileOutputStream out = new FileOutputStream(new File("D:\\exceldatabase.xlsx"));
			//写文件
			workbook.write(out);
			//关闭流
			out.close();
			System.out.println("exceldatabase.xlsx written successfully");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
