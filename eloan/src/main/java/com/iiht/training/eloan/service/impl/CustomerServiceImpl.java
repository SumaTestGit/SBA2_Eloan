package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.exception.ClerkNotFoundException;
import com.iiht.training.eloan.exception.LoanNotFoundException;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.CustomerService;
import com.iiht.training.eloan.service.util.EMParser;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingInfoRepository pProcessingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Override
	public UserDto register(UserDto userDto) {
		
		if(userDto != null) {			
			
			String firstName = usersRepository.findByFirstName(userDto.getFirstName());
			if (firstName != null) {
				
				throw new ClerkNotFoundException("First Name# " + userDto.getFirstName() + " exists in DB");
			}
			
			userDto = EMParser.parse(usersRepository.save(EMParser.parse(userDto)));
		}
		
		return userDto;		
	}

	@Override
	public LoanOutputDto applyLoan(Long customerId, LoanDto loanDto) {
		
		LoanOutputDto loanOutputDto = null;
		
		if(loanDto != null) {			
			
			String loanName = loanRepository.findByLoanName(loanDto.getLoanName());
			
			if (loanName != null) {
				
				throw new LoanNotFoundException("Loan Name# " + loanDto.getLoanName() + " exists in DB");
			}
			
			loanDto = EMParser.parse(loanRepository.save(EMParser.parse(loanDto)));
		}
		
		return loanOutputDto;
	}

	@Override
	public LoanOutputDto getStatus(Long loanAppId) {
		
		LoanOutputDto loanOutputDto = null;
		
		if(!loanRepository.existsById(loanAppId)) {
			
			throw new LoanNotFoundException("Loan Application Id# " + loanAppId + " does not exists in DB");
		}
		
		/*
		 * Loan loan = loanRepository.findStatusByLoanAppId(loanAppId);
		 * 
		 * loanOutputDto.setLoanAppId(loanAppId);
		 * loanOutputDto.setStatus(loan.getStatus());
		 * loanOutputDto.setRemark(loan.getRemark());
		 */
			
		return loanOutputDto;
	}

	@Override
	public List<LoanOutputDto> getStatusAll(Long customerId) {
		
		List<LoanOutputDto> loanOutputDto = null;
		
		if(!loanRepository.existsById(customerId)) {
			
			throw new LoanNotFoundException("Customer Id# " + customerId + " does not exists in DB");
		}
		
		List<Loan> loan = loanRepository.findAllByLoanId(customerId);
		
		/*
		 * for(Loan l1:loan) {
		 * 
		 * loanOutputDto.setStatus(l1.getStatus());
		 * loanOutputDto.setRemark(l1.getRemark()); }
		 */
						
		return loanOutputDto;	
	}

}
