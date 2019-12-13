package com.base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass{

	public static void main(String[] args)  throws Exception{
		launchbrowser("https://adactin.com/HotelApp/");
		LoginPage l=new LoginPage();
		insertID(l.getUsername(), "SanjayG1993");
		insertID(l.getPassword(), "cyclone1993");
		btn_clc(l.getBtn());
		
		
		FillUp f=new FillUp();
		slct(f.getDd(), "Sydney");
		slct(f.getDf(), "Hotel Sunshine");
	slct(f.getF(), "Standard");
	slct(f.getG(), "2");
	slct(f.getH(), "3");
	slct(f.getI(), "2");
	btn_clc(f.getJ());
	Third_Page t=new Third_Page();
	btn_clc(t.getAb());
	btn_clc(t.getAc());
	Fourth_page fp=new Fourth_page();
	
	List<WebElement> lk = fp.getLk();
	for(WebElement row: lk) {
		List<WebElement> col= fp.getKk();
		for(WebElement fin:col) {
			System.out.println(row);
		}
	}
	
	}

}
