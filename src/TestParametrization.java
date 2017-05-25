import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParametrization {
	
	@Test(dataProvider = "getData")
	public void TestLogin(String username, Integer age){
		
		System.out.println("Testing Login with username:"+username+" and age as "+age);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		// 1st row
		data[0][0] = "abc@yahoomail.com";
		data[0][1] = 23;
		
		// 2nd row 
		data[1][0] = "abcd@gmail.com";
		data[1][1] = 27;
		
		return data;		
	}
	
	

}
