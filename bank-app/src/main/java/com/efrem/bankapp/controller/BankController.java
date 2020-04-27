package com.efrem.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.efrem.bankapp.entities.Account;
import com.efrem.bankapp.entities.Operation;
import com.efrem.bankapp.service.IBankService;

@Controller
public class BankController {

	@Autowired
	private IBankService bankService;
	
	@RequestMapping("/home")
	public String toHome() {
		
		return "accounts";
	}
	
	@RequestMapping("/getAccount")
	public String getAccountById(@RequestParam(name="accountId")String accountId, Model model,
			        @RequestParam(name="page",defaultValue="0") int page) {
						
		model.addAttribute("accountIdModel", accountId);
		
		try {
			Account account = bankService.getAccountById(accountId);
			model.addAttribute("accountModel", account);
			Page<Operation>pageOperation= bankService.getAccountOperationByPage(accountId, page, 4);
			int pageNumber= pageOperation.getTotalPages();
			Integer[] pages= new Integer[pageNumber];
			
			for(int i=0; i<pageNumber; i++) {
				pages[i]=i;
			}
			model.addAttribute("pageOperationsModel", pageOperation);
			model.addAttribute("pagesModel", pages);
			
		}
		catch (Exception e) {
			model.addAttribute("exceptionModel", e);
		}
		return "accounts";
	}
	
	public String saveAccountOperation(Model model, String accountId, String operationType,
			                          String accountIdDest, @RequestParam(name="operationAmount", defaultValue="0") double operationAmount) {
		try {
if(operationType.equals("PAYMENT")) {
	bankService.payToAccount(accountId, operationAmount);
} else if(operationType.equals("WITHDTAWAL")) {
	bankService.removeFromAccount(accountId, operationAmount);
} else {
	bankService.transfer(accountId, accountIdDest, operationAmount);
	}
}
		catch(Exception e) {
			model.addAttribute("errorModel", e);
			return "redirect:/getAccount?accountId=" + accountId +"&errorModel=" +
					               e.getMessage();
		}
	return "redirect:/getAccount?accountId=" + accountId;
			}
	
}
