package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException
	{
		//Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://103.211.39.246/ranford2/");
		
		//Admin Login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Mindq@Sel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		
	    //Branch Creation
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		//Drop Down
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		//Role Creation
		
		//Employee Creation
		
		//Banker Login
	}

}
