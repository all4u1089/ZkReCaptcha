package demo.captcha;

import java.io.IOException;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;



public class Captcha {
	@Command
	public void testCaptcha(@BindingParam("res")final String res) throws IOException{
		System.out.println("testCaptcha: " + res);
		boolean verify = VerifyRecaptcha.verify(res);
		System.out.println("verify: " + verify);
		
	}
}
