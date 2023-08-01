package in.gov.bsf.projrcts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() throws InterruptedException {
		   
		
		System.out.println("Start loginTest");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open test Page
		String url = "http://cgpsc.demodevelopment.com/auth/login";
		driver.get(url);
		System.out.println("Page is open");
        //Maximize browser window
		driver.manage().window().maximize();
		// sleep for 3 seconds
		Thread.sleep(2000);
		// enter username
		WebElement EmailId = driver.findElement(By.id("loginform-username"));
		EmailId.sendKeys("skhushbu761@gmail.com");
		
		Thread.sleep(2000);
		
		// enter Password
		WebElement Password = driver.findElement(By.id("loginform-password"));
		Password.sendKeys("Password123@");
		
		Thread.sleep(2000);
	
		// Click login button
		driver.findElement(By.xpath("//*[@id=\"admin-login-form\"]/button")).click();

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("card-box-bottom__head")))).click();
	    System.out.println("Pass1");
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("action")))).click();
	    JavascriptExecutor js123 = (JavascriptExecutor) driver;
	    js123.executeScript("window.scrollBy(0,350)","");
	    driver.findElement(By.id("registrationform-father_name")).clear();
	    driver.findElement(By.id("registrationform-father_name")).sendKeys("M k singh");
	    //driver.findElement(By.id("")).clear();
	    driver.findElement(By.id("registrationform-mother_name")).clear();
	    driver.findElement(By.id("registrationform-mother_name")).sendKeys("Xyz"); 
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@id='registrationform_nationality_chosen']")).click();
	    driver.findElement(By.xpath("//span[text()='INDIAN']")).click();
	    
	    WebElement d = driver.findElement(By.id("registrationform_religion_chosen"));
	    d.click();

	    WebElement option = driver.findElement(By.xpath("//div[@id='registrationform_religion_chosen']//li[text()='Buddhist']"));
	    option.click();
	    driver.findElement(By.xpath("//div[@id='registrationform_gender_chosen']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='registrationform_gender_chosen']//li[text()='FEMALE']")).click();
	    driver.findElement(By.xpath("//div[@id='registrationform_marital_status_chosen']")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_marital_status_chosen']//li[text()='No']")).click();
	   
	   WebElement datebox=driver.findElement(By.xpath("//*[@id=\"registrationform-date_of_birth\"]"));
	   
	   datebox.click();
	   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("datepicker-days")));
	   String monthyearval=driver.findElement(By.className("datepicker-switch")).getText();
	   System.out.println(monthyearval);
	   String month= monthyearval.split(" ")[0].trim();
	   String year= monthyearval.split(" ")[1].trim();
	   
	   while(!(month.equals("April") && year.equals("1999"))){
	 	  
	 	 
	 	  driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
	 	  
	 	  monthyearval=driver.findElement(By.className("datepicker-switch")).getText();
	 	  System.out.println(monthyearval);
	 	  month= monthyearval.split(" ")[0].trim();
	 	   year= monthyearval.split(" ")[1].trim();
	 	  
	   }
	   Thread.sleep(3000);
	   WebElement da =driver.findElement(By.xpath("//td[normalize-space()='24']"));
	   da.click();
	   System.out.println(da);
	  
	   
	   
	   driver.findElement(By.xpath("//input[@id='registrationform-birth_place']")).clear();
	   driver.findElement(By.xpath("//input[@id='registrationform-birth_place']")).sendKeys("Deoghar");
	   driver.findElement(By.id("registrationform_dob_document_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_dob_document_chosen']//li[text()='12th MarkSheet/Old 11th MarkSheet']")).click();
	   driver.findElement(By.id("registrationform-dob_certificate_no")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.id("registrationform-dob_certificate_no")).sendKeys("HGDjksd589784vv");
	   
	   Thread.sleep(2000);
	   JavascriptExecutor js12 = (JavascriptExecutor) driver;
	   js12.executeScript("window.scrollBy(0,500)","");
	   
	   
	   
	   driver.findElement(By.id("registrationform_is_domiciled_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_domiciled_chosen']//li[text()='No']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("registrationform_is_rural_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_rural_chosen']//li[text()='Rural']")).click();
	   JavascriptExecutor js1 = (JavascriptExecutor) driver;
	   js1.executeScript("window.scrollBy(0,600)","");
	   Thread.sleep(2000);
	   driver.findElement(By.id("registrationform_social_category_id_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_social_category_id_chosen']//li[text()='UR(Un Reserved)']")).click();
	   
	   
	   
	   driver.findElement(By.id("registrationform_disability_id_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_disability_id_chosen']//li[text()='No']")).click();
	   JavascriptExecutor js124 = (JavascriptExecutor) driver;
	   js124.executeScript("window.scrollBy(0,1000)","");
	   
	   driver.findElement(By.id("registrationform_is_cgarh_govt_employee_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_cgarh_govt_employee_chosen']//li[text()='No']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.id("registrationform_is_cgarh_govt_contract_employee_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_cgarh_govt_contract_employee_chosen']//li[text()='No']")).click();
	   
	   driver.findElement(By.id("registrationform_is_excluded_examination_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_excluded_examination_chosen']//li[text()='No']")).click();
	   
	   driver.findElement(By.id("registrationform_is_terminated_chosen")).click();
	   driver.findElement(By.xpath("//div[@id='registrationform_is_terminated_chosen']//li[text()='No']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.id("registrationform_is_court_case_chosen")).click();
	   
	   driver.findElement(By.xpath("//div[@id='registrationform_is_court_case_chosen']//li[text()='No']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	   
	   
//------------------------------*---------------------------------:Address details:---------------------------------------*-----------------------------------
	   
	  
	    Thread.sleep(3000);
	    driver.findElement(By.id("registrationform-permanent_address_address1")).clear();
	    driver.findElement(By.id("registrationform-permanent_address_address1")).sendKeys("Naugachia");
	    
	   /*driver.findElement(By.id("registrationform_permanent_address_state_code_chosen")).click();
	    driver.findElement(By.xpath("//div[@id='registrationform_permanent_address_state_code_chosen']//li[text()='Bihar']")).click();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.id("registrationform_permanent_address_district_code_chosen")).click();
		   driver.findElement(By.xpath("//div[@id='registrationform_permanent_address_district_code_chosen']//li[text()='Bishwanath']")).click();
		   Thread.sleep(3000);*/
	    driver.findElement(By.id("registrationform_permanent_address_state_code_chosen")).click();
	    driver.findElement(By.xpath("//div[@id='registrationform_permanent_address_state_code_chosen']//li[text()='HARYANA']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("registrationform_permanent_address_district_code_chosen")).click();
	    driver.findElement(By.xpath("//div[@id='registrationform_permanent_address_district_code_chosen']//li[text()='Ambala']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("registrationform-permanent_address_pincode")).clear();
	    driver.findElement(By.id("registrationform-permanent_address_pincode")).sendKeys("853204");
	    
	    driver.findElement(By.id("registrationform-permanent_address_nearest_police_station")).clear();
	    driver.findElement(By.id("registrationform-permanent_address_nearest_police_station")).sendKeys("ABC");
	    
	    WebElement radio1 =driver.findElement(By.id("copyPasteAddress"));
	    radio1.click();
	    radio1.click();
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
		   JavascriptExecutor jsa12 = (JavascriptExecutor) driver;
		   jsa12.executeScript("window.scrollBy(0,500)","");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		   Thread.sleep(2000);
		   
//--------------------*----------------------------------:Qualification Page:-----------------------------------------*--------------------------------------		   
		   
		   driver.findElement(By.id("registrationform_qualification_type_id_chosen")).click();
		   driver.findElement(By.xpath("//div[@id='registrationform_qualification_type_id_chosen']//li[text()='SSC/Matric/High School']")).click();
		   
		    driver.findElement(By.id("registrationform-degree_name")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("registrationform-degree_name")).sendKeys("ABC");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("registrationform-other_university_name")).sendKeys("ABC");
		    Thread.sleep(1000);
		    driver.findElement(By.id("registrationform-institute_name")).sendKeys("ABC");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("registrationform_passing_year_chosen")).click();
			driver.findElement(By.xpath("//div[@id='registrationform_passing_year_chosen']//li[text()='1985']")).click();
			   
			driver.findElement(By.id("registrationform_result_status_chosen")).click();
			driver.findElement(By.xpath("//div[@id='registrationform_result_status_chosen']//li[text()='PASSED']")).click();
			
			driver.findElement(By.id("registrationform_mark_type_chosen")).click();
			driver.findElement(By.xpath("//div[@id='registrationform_mark_type_chosen']//li[text()='GRADE']")).click();
			
			driver.findElement(By.id("registrationform_grade_chosen")).click();
			driver.findElement(By.xpath("//div[@id='registrationform_grade_chosen']//li[text()='A']")).click();
			
			  driver.findElement(By.id("registrationform-percentage")).sendKeys("98");
			  
			  driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			  
			  Thread.sleep(1000);
			  driver.findElement(By.id("registrationform_qualification_type_id_chosen")).click();
			   driver.findElement(By.xpath("//div[@id='registrationform_qualification_type_id_chosen']//li[text()='Intermediate(10+2)']")).click();
			   
			    driver.findElement(By.id("registrationform-degree_name")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.id("registrationform-degree_name")).sendKeys("ABC");
			    Thread.sleep(1000);
			    
			    driver.findElement(By.id("registrationform-other_university_name")).sendKeys("ABC");
			    Thread.sleep(1000);
			    driver.findElement(By.id("registrationform-institute_name")).sendKeys("ABC");
			    Thread.sleep(1000);
			    
			    driver.findElement(By.id("registrationform_passing_year_chosen")).click();
				driver.findElement(By.xpath("//div[@id='registrationform_passing_year_chosen']//li[text()='1987']")).click();
				   
				driver.findElement(By.id("registrationform_result_status_chosen")).click();
				driver.findElement(By.xpath("//div[@id='registrationform_result_status_chosen']//li[text()='PASSED']")).click();
				
				driver.findElement(By.id("registrationform_mark_type_chosen")).click();
				driver.findElement(By.xpath("//div[@id='registrationform_mark_type_chosen']//li[text()='GRADE']")).click();
				
				driver.findElement(By.id("registrationform_grade_chosen")).click();
				driver.findElement(By.xpath("//div[@id='registrationform_grade_chosen']//li[text()='A']")).click();
				
				  driver.findElement(By.id("registrationform-percentage")).sendKeys("98");
				  
				  driver.findElement(By.xpath("//button[@id='submitButton']")).click();
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("registrationform_qualification_type_id_chosen")).click();
				   driver.findElement(By.xpath("//div[@id='registrationform_qualification_type_id_chosen']//li[text()='Graduation degree IN ANY stream FROM a government-recognized Institute/College/University']")).click();
				   
				    driver.findElement(By.id("registrationform-degree_name")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.id("registrationform-degree_name")).sendKeys("ABC");
				    Thread.sleep(1000);
				    
				    driver.findElement(By.id("registrationform-other_university_name")).sendKeys("ABC");
				    Thread.sleep(1000);
				    driver.findElement(By.id("registrationform-institute_name")).sendKeys("ABC");
				    Thread.sleep(1000);
				    
				    driver.findElement(By.id("registrationform_passing_year_chosen")).click();
					driver.findElement(By.xpath("//div[@id='registrationform_passing_year_chosen']//li[text()='1990']")).click();
					   
					driver.findElement(By.id("registrationform_result_status_chosen")).click();
					driver.findElement(By.xpath("//div[@id='registrationform_result_status_chosen']//li[text()='PASSED']")).click();
					
					driver.findElement(By.id("registrationform_mark_type_chosen")).click();
					driver.findElement(By.xpath("//div[@id='registrationform_mark_type_chosen']//li[text()='GRADE']")).click();
					
					driver.findElement(By.id("registrationform_grade_chosen")).click();
					driver.findElement(By.xpath("//div[@id='registrationform_grade_chosen']//li[text()='A']")).click();
					
					  driver.findElement(By.id("registrationform-percentage")).sendKeys("98");
					  
					  driver.findElement(By.xpath("//button[@id='submitButton']")).click();
				  
				  Thread.sleep(2000);
				   JavascriptExecutor jsa123 = (JavascriptExecutor) driver;
				   jsa123.executeScript("window.scrollBy(0,1000)","");
				  
				  driver.findElement(By.id("reviewform-agreecheckbox")).click();
				  
				  Thread.sleep(2000);
				  
				  driver.findElement(By.xpath("//a[@class='c-button c-button--primary brown u-pad10_30 baseText rounded js-qualificationSubmit']")).click();
				  
//------------------------**----------------------------------:Work Experience Page:----------------------------------**--------------------------
				  
				  Thread.sleep(2000);
				  
				  driver.findElement(By.id("registrationform_is_employed_chosen")).click();
				   driver.findElement(By.xpath("//div[@id='registrationform_is_employed_chosen']//li[text()='No']")).click();
				   
				   //driver.findElement(By.id("registrationform-employer_name")).clear();
				   // driver.findElement(By.id("registrationform-employer_name")).sendKeys("XYZ");
				    
				   //driver.findElement(By.id("registrationform-designation")).clear();
				   //driver.findElement(By.id("registrationform-designation")).sendKeys("XYZ");
				    
				    
				    
				    /*WebElement datebox1=driver.findElement(By.xpath("//*[@id=\"registrationform-start_date\"]"));
					   
					   datebox1.click();
					   WebDriverWait wait1a = new WebDriverWait(driver, Duration.ofSeconds(10));
					   wait1a.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("datepicker-days")));
					   String monthyearval1=driver.findElement(By.className("datepicker-switch")).getText();
					   System.out.println(monthyearval1);
					   String month1= monthyearval1.split(" ")[0].trim();
					   String year1= monthyearval1.split(" ")[1].trim();
					   
					   while(!(month.equals("April") && year.equals("1991"))){
					 	  
					 	 
					 	  driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='<<']")).click();
					 	  
					 	  monthyearval=driver.findElement(By.className("datepicker-switch")).getText();
					 	  System.out.println(monthyearval);
					 	  month= monthyearval.split(" ")[0].trim();
					 	   year= monthyearval.split(" ")[1].trim();
					 	  
					   }
					   
					   
				    */
				   // driver.findElement(By.id("registrationform-office_name")).clear();
				   // driver.findElement(By.id("registrationform-office_name")).sendKeys("XYZ");
				   // Thread.sleep(1000);
				    JavascriptExecutor js1245 = (JavascriptExecutor) driver;
					   js1245.executeScript("window.scrollBy(0,1000)","");
				    
				   // driver.findElement(By.xpath("//button[@id='submitButton']")).click();
					//   Thread.sleep(2000);
				  
			
				  
					   driver.findElement(By.id("reviewform-agreecheckbox")).click();
						  
						  driver.findElement(By.xpath("//a[@class='c-button c-button--primary brown u-pad10_30 baseText rounded js-workSubmit']")).click(); 
			
//-------------------------*-------------------------------:Upload Photo & Signature:--------------------------------*-------------------------------------------
						  Thread.sleep(1000);
						  
						  //driver.findElement(By.xpath("//div[@class='cop-form__uploader design2 design2--auto']")).click(); 
						  Thread.sleep(1000);
						  //String filePath = "path/to/photo.jpg"; // Replace with the actual path of the photo you want to upload
						  //fileInput.sendKeys(filePath);
						//  driver.findElement(By.xpath("//form[@id='upload-dropzone-file_uploadPhoto']")); 
                         /* JavascriptExecutor js=(JavascriptExecutor)driver;
                          js.executeScript("arguments[0].click();",button);*/
						  //c-button c-button--primary brown u-pad10_30 baseText rounded js-workSubmit
						  
						  driver.findElement(By.xpath("//button[@id='submitButton']")).click();

						
//---------------------------------------*-------------------------------:Criteria:-----------------------------------*----------------------------------------	
						  Thread.sleep(3000);
						    
						   //driver.findElement(By.className("chosen-container chosen-container-single")).click();
						  WebElement rad=driver.findElement(By.xpath("//span[normalize-space()='Archaeologist']"));
						  rad.click();
						  rad.click();
						   // Thread.sleep(2000);
						   // driver.findElement(By.xpath("//span[normalize-space()='Archaeologist']")).click();
						  JavascriptExecutor js123ac = (JavascriptExecutor) driver;
							 js123ac.executeScript("window.scrollBy(0,350)","");
							
							
							 driver.findElement(By.id("registrationform_field1_chosen")).click();
							 driver.findElement(By.xpath("//div[@id='registrationform_field1_chosen']//li[text()='Yes']")).click();
							 
							 JavascriptExecutor js123a = (JavascriptExecutor) driver;
							 js123a.executeScript("window.scrollBy(0,500)","");
							 
							 
							 driver.findElement(By.id("registrationform_field2_chosen")).click();
							 driver.findElement(By.xpath("//div[@id='registrationform_field2_chosen']//li[text()='Yes']")).click();
							 
							 driver.findElement(By.id("registrationform_field3_chosen")).click();
							 driver.findElement(By.xpath("//div[@id='registrationform_field3_chosen']//li[text()='Yes']")).click();
							 
							 JavascriptExecutor js123b = (JavascriptExecutor) driver;
							    js123b.executeScript("window.scrollBy(0,1000)","");
							 
							 driver.findElement(By.id("registrationform_field4_chosen")).click();
							 driver.findElement(By.xpath("//div[@id='registrationform_field4_chosen']//li[text()='Yes']")).click();
							 
							 driver.findElement(By.id("registrationform_field5_chosen")).click();
							 driver.findElement(By.xpath("//div[@id='registrationform_field5_chosen']//li[text()='Yes']")).click();
							 
							 driver.findElement(By.id("reviewform-agreecheckbox")).click();
							  
							  //driver.findElement(By.xpath("//a[@class='c-button c-button--primary brown u-pad10_30 baseText rounded js-criteriaSubmitCheckbox']")).click();
							   
							  Thread.sleep(1000);
							  
							  driver.findElement(By.xpath("//button[@id='submitButton']")).click();
					 //close browser
					//driver.quit();

	}

	private void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
