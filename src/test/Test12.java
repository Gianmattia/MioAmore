package test;

import static org.junit.Assert.*;
import logic.bean.ArtistBean;
import logic.exceptions.LoginException;
import logic.appcontroller.LoginController;
import org.junit.Test;
public class  Test12 {

	@Test
   public	void test() throws LoginException, javax.security.auth.login.LoginException   {
		LoginController loginController = new LoginController();
		ArtistBean check = loginController.artistLogin("meo","password");
      assertEquals("mimo",check. getTalent());
	}

}









