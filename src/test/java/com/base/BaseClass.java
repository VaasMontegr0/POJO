package com.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver;
public static void launchbrowser(String url) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Download\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
}

public static void insertID(WebElement loc, String s) {
	
	loc.sendKeys(s);
}


public static void btn_clc(WebElement k) {
		k.click();
		
	}

public static void slct(WebElement e, String g) {
	Select s =new Select(e);
	s.selectByValue(g);
}

public static void excel(WebElement et, String gh, Integer i) throws Throwable  {
File loc= new File("D:\\Excel\\untitled1.xls");
FileOutputStream o=new FileOutputStream(loc);
Workbook w= new HSSFWorkbook();	
Sheet s=w.createSheet("Adactin_webdata");
Row r=s.createRow(i);
Cell c=r.createCell(i);
c.setCellValue(gh);
w.write(o);
}


}


