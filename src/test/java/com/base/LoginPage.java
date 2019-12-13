package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

public	LoginPage (){
		
PageFactory.initElements(driver, this);		
		
	}
@FindBy(id="username")	//driver.findElement(By.id="email")
private WebElement username;

@FindBy(id="password")
private WebElement password;


@FindBy(id="login")
private WebElement btn;


public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getBtn() {
	return btn;
	
}

}


