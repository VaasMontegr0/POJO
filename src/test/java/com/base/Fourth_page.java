package com.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fourth_page extends BaseClass {

public Fourth_page() {
	
	PageFactory.initElements(driver, this);
}	
@FindBy(tagName="tr")
private List<WebElement> lk;

public List<WebElement> getLk(){
	return lk;
}
@FindBy(tagName="td")
private List<WebElement> kk;
public List<WebElement> getKk(){
	return kk;
}

}
