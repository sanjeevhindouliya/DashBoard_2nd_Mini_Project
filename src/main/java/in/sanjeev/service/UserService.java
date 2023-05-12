package in.sanjeev.service;

import in.sanjeev.binding.LoginForm;
import in.sanjeev.binding.SignUpForm;
import in.sanjeev.binding.UnlockForm;



public interface UserService {
	
	public String login(LoginForm form); 
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String email);
	
	

}
