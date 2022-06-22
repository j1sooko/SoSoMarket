package com.example.jpetstore.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.jpetstore.service.SosoMarketFacade;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/user/deleteUser.do")
public class DeleteAccountController { 
	
	@Value("DeleteAccountForm")
	private String formViewName;
	@Value("index")
	private String successViewName;
	
	private SosoMarketFacade sosoMarket;
	
	@Autowired
	public void setSosomarket(SosoMarketFacade sosoMarket) {
		this.sosoMarket = sosoMarket;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		return formViewName;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String handleRequest(
			HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountForm accountForm,
			@ModelAttribute("userSession") UserSession userSession,
			BindingResult result) throws Exception {
		
		String inputPassword = accountForm.getAccount().getPassword();
		String accountId = userSession.getAccount().getAccountId();
		
//		Account account = sosoMarket.getAccount(accountId);
		try {
			if (sosoMarket.getAccount(accountId).getPassword().equals(inputPassword))
				sosoMarket.deleteAccount(accountId);
		} catch (DataIntegrityViolationException ex) {
	         result.reject("PASSWORD_MISMATCH", "비밀번호가 틀렸습니다. 다시 시도하세요");
	         return formViewName; 
	      }

		return successViewName;
	}
}

