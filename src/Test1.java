import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void TestCaseNumber1(){
		System.out.println("Executing Testcase 1 from TestClass1");
	}
	
	@Test
	public void TestCaseNumber2(){
		System.out.println("Executing Testcase 2 from TestClass1");
	}
	
	@BeforeMethod
	public void BeforeEveryMethod(){
		System.out.println("@BeforeMethod: Executed before every testcase");
	}
	
	@AfterMethod
	public void AfterEveryMethod(){
		System.out.println("@AfterMethod : Executed after every testcase");
	}
	
	@BeforeTest
	public void BeforeEveryClass(){
		System.out.println("@Before Test: Executed in the beginning of every class of testcases before calling any TESTNG Annotations within the class");
	}
	
	@AfterTest
	public void AfterEveryClass(){
		System.out.println("@AfterTest : Executed in the end of every class of testcases after calling all the TESTNG Annotations within the class");
	}
	
	@BeforeSuite
	public void BeforeEveryExecution(){
		System.out.println("@Before Suite: Executed in the beginning of any execution cycle");
	}
	
	@AfterSuite
	public void AfterEveryExecution(){
		System.out.println("@AfterSuite: Executed in the end of any execution cycle");
	}
}
