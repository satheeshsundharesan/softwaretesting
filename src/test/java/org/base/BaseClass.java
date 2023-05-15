package org.base;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	 public static void windowsmaximize() {
		 driver.manage().window().maximize();
	 }
	 
	 public static void launuchurl(String url) {
		driver.get(url);
	 }	
	 
	 public static String PageTitle() {
		  String title = driver.getTitle();
		  return title;
		 	 
	 }	
	 
	 public static void Pageurl() {
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
	 }	
	 
	 public static void passtext(String string ,WebElement ele) {
		 ele.sendKeys(string);
	 }
	 public static void closeentirebroweser() {
		 driver.quit();
	 }
	 public static void clickbtn( WebElement ele) {
	      ele.click();
	      
	 }
	 public static void screenshot(String imgName) throws IOException {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File img=ts.getScreenshotAs(OutputType.FILE);
		 File f=new File("location +imgName.png");
		 FileUtils.copyFile(img, f);
	 }
	 public static Actions a;
	 
	 public static void movethecursor (WebElement targetwebelement) {
		 a=new Actions(driver);
		 a.moveToElement(targetwebelement).perform();
	 }
	 
	 public static void dragdrop(WebElement dragElement,WebElement dropElement) {
		 a=new Actions(driver);
		 a.dragAndDrop(dragElement, dropElement).perform();
	 }	
	 public static  JavascriptExecutor js;
	 public static void Scrollthepage(WebElement tarwebele) {
		 js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", tarwebele); 
	 }
	 public static void scroll(WebElement element) {
		 js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(false)", element);
	 }	 
		 public static void  excelread(String Sheetname,int rownum,int cellnum) throws IOException {
			 File f = new File("execelname.xlsx");
			 FileInputStream file = new FileInputStream(f);
			 Workbook wb = new XSSFWorkbook(file);
			 Sheet s = wb.getSheet("Data");
			 Row r = s.getRow(rownum);
			 Cell c = r.getCell(cellnum);
			 int cellType = c.getCellType();
			 
			 String value=" ";
			 if (cellType==1) {
				 String value2=c.getStringCellValue();	
			}
			 else if (DateUtil.isCellDateFormatted(c)) {
				 Date dateCellValue = c.getDateCellValue();
				 SimpleDateFormat simple=new SimpleDateFormat(value);
				 simple.format(dateCellValue);
			}
			 
			 else {
				double d=c.getNumericCellValue();
				long i=(long)d;
				String.valueOf(i);
			 }
		}
			 public static void createNewExcelFile (int rowNum, int cellNum, String writeData) throws IOException {
			 File f = new File ("C:\\Users\\admin\\eclipse-workspace\\DataDriven4\\Excel\\newfile.xlsx"); 
			 Workbook w = new XSSFWorkbook () ;
			 Sheet newSheet = w.createSheet("Data");
			 Row newRow = newSheet.createRow (rowNum) ;
			 Cell newCell = newRow.createCell (cellNum);
			 newCell.setCellValue (writeData);
			 FileOutputStream fos= new FileOutputStream(f);
			 w.write(fos);
			 }
			 
			 public static void createCell (int getRow, int creCell, String newData) throws IOException {
				 File f = new File ("C:\\Users\\admin\\eclipse-workspace\\DataDriven4\\Excel\\newfile.xlsx");
				 FileInputStream fis = new FileInputStream(f);
				 Workbook wb = new XSSFWorkbook (fis);
				 Sheet s = wb.getSheet ("Data");
				 Row r = s.getRow(getRow);
				 Cell c = r.createCell (creCell);
				 c.setCellValue (newData) ;
				 FileOutputStream fos = new FileOutputStream(f);
				 wb.write (fos);
			 }
			 public static void createRow (int creRow, int creCell, String newData) throws IOException {
				 File f = new File ("C:\\Users\\admin\\eclipse-workspace\\DataDriven4\\Excel\\newfile.xlsx");
				 FileInputStream fis = new FileInputStream(f);
				 Workbook wb = new XSSFWorkbook (fis);
                 Sheet s = wb.getSheet ("Data");
				 Row r = s.createRow(creRow);
				 Cell c = r.createCell (creCell);
				 c.setCellValue (newData) ;
				 FileOutputStream fos = new FileOutputStream(f);
				 wb.write (fos);
			 }

			public static void updateDataToParticularCell (int getTheRow, int getTheCell, String exisitingData, String writeNewData) throws IOException {
			 File f = new File ("C:\\Users\\admin\\eclipse-workspace\\DataDriven4\\Excel\\newfile.xlsx");
			 FileInputStream fis = new FileInputStream(f);
			 Workbook wb = new XSSFWorkbook (fis);
			 Sheet s = wb.getSheet ("Data");
			 Row r = s.getRow(getTheRow) ;
			 Cell c = r.getCell (getTheCell);
			 String str = c.getStringCellValue();	
			 
			 if (str.equals(exisitingData)) {
			 c.setCellValue (writeNewData) ; 
			 }
			 FileOutputStream fos = new FileOutputStream(f);
			 wb.write (fos);
}
			 
			 
			 
			 
			 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
	 
		 
		 
		 

	}
	
	
	
	


