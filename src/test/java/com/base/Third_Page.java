package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Page extends BaseClass {
	
public Third_Page ()	{
PageFactory.initElements(driver, this);	
	}

@FindBy(id="radiobutton_0")
private WebElement ab;
public WebElement getAb() {
	return ab;	
}
@FindBy(id="continue")
private WebElement ac;
public WebElement getAc() {
	return ac;
}


}
