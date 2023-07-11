package comtestNg;

import org.testng.annotations.Test;


public class Data_TestNG {
	
 @Test(priority=-1)
   	private void emp_name() {
		// TODO Auto-generated method stub
             System.out.println("Anu");
	}
	@Test(priority=-2)
	private void emp_no() {
		// TODO Auto-generated method stub
		System.out.println("1234");
			}
	@Test(priority=3)
	private void emp_salary() {
		// TODO Auto-generated method stub
                System.out.println("10000");
	}

}
