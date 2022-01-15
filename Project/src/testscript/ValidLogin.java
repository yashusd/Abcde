package testscript;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_Readexcel;
import pom.Pom_Facebook;
		
public class ValidLogin extends Base_Test {
	
	@Test
	public void getLogged(){
		String un=Generic_Readexcel.getData("sheet1",0,0);
		String pwd=Generic_Readexcel.getData("sheet1",1,0);
		Pom_Facebook fb=new Pom_Facebook(driver);
		fb.setEmail(un);
		fb.setPwd(pwd);
		fb.loginBtn();
		
	}
}
