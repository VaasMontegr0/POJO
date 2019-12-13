package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillUp extends BaseClass {

public FillUp() {
	
PageFactory.initElements(driver, this);	
	
}	
@FindBy(id="location")
private WebElement dd;
public WebElement getDd(){
	return dd;
	} 
@FindBy(id="hotels")
private WebElement df;

public WebElement getDf(){
	return df;
	} 
@FindBy(id="room_type")
private WebElement f;

public WebElement getF() {
return f;	
}
@FindBy(id="room_nos")
private WebElement g;
public WebElement getG() {
	return g;
}
@FindBy(id="adult_room")
private WebElement h;
public WebElement getH() {
	return h;
}
@FindBy(id="child_room")
private WebElement i;
public WebElement getI() {
	return i;
	}
@FindBy(id="Submit")
private WebElement j;
public WebElement getJ() {
	return j;
	
}





}
