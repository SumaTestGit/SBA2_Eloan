package com.iiht.training.eloan.service.util;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.entity.Users;

public class EMParser {

	public static UserDto parse(Users source) {

		UserDto target = new UserDto();

		target.setId(source.getId());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setEmail(source.getEmail());
		target.setMobile(source.getMobile()); 
		target.setRole(source.getRole());
		
		return target;
	}

	public static Users parse(UserDto source) {
		
		Users target = new Users();

		target.setId(source.getId());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setEmail(source.getEmail());
		target.setMobile(source.getMobile()); 
		target.setRole(source.getRole());		
		
		return target;
	}
	
	public static LoanDto parse(Loan source) {

		LoanDto target = new LoanDto();

		target.setLoanId(source.getLoanId());
		/* target.setCustomerId(source.getCustomerId()); */
		target.setLoanName(source.getLoanName());
		target.setLoanAmount(source.getLoanAmount());
		target.setLoanApplicationDate(source.getLoanApplicationDate());
		target.setBusinessStructure(source.getBusinessStructure());
		target.setBillingIndicator(source.getBillingIndicator());
		target.setTaxIndicator(source.getTaxIndicator());
		target.setStatus(source.getStatus());
		target.setRemark(source.getRemark());
		
		target.setUser(parse(source.getUser()));
		
		return target;
	}

	public static Loan parse(LoanDto source) {
		
		Loan target = new Loan();

		target.setLoanId(source.getLoanId());
		/* target.setCustomerId(source.getCustomerId()); */
		target.setLoanName(source.getLoanName());
		target.setLoanAmount(source.getLoanAmount());
		target.setLoanApplicationDate(source.getLoanApplicationDate());
		target.setBusinessStructure(source.getBusinessStructure());
		target.setBillingIndicator(source.getBillingIndicator());
		target.setTaxIndicator(source.getTaxIndicator());
		target.setStatus(source.getStatus());
		target.setRemark(source.getRemark());

		target.setUser(parse(source.getUser()));
		
		return target;
	}
	
	

}
