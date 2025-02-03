package TestNG;

import org.testng.annotations.*;

public class testng_practice {
	
	@Test(dataProvider="dp")
	void m1(String pass, String num) {
		
		System.out.println("I am just a method coantaing"+pass+num);
		
	}
	
	
	@DataProvider(name="dp")
	Object[][] getData() {
		Object[][] data = {
			{"Pass","123"},{"Pass1","1231"},{"Pass2","1232"},{"Pass3","1233"},{"Pass4","1234"}
			
		};
		return data;
	}
	 
	

}
