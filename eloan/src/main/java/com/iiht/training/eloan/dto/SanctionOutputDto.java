package com.iiht.training.eloan.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SanctionOutputDto {
	
	@NotNull(message="Loan Amount Sanctioned is mandatory")
	@NotBlank(message="Loan Amount Sanctioned is mandatory")
	@Min(value=1,message="Loan Amount Sanctioned can not be negative or zero")
	private Double loanAmountSanctioned;
	
	@NotNull(message="Loan Term is mandatory")
	@NotBlank(message="Loan Term is mandatory")	
	@Min(value=12,message="Loan Term can not be less than 12 months")
	private Double termOfLoan;
	
	@NotNull(message="Payment Start Date is mandatory")
	@NotBlank(message="Payment Start Date is mandatory")
	@Future(message="Payment Start Date can not be past or current date")
	private LocalDate paymentStartDate;
	
	@NotNull(message="Loan Closure Date is mandate")
	@NotBlank(message="Loan Closure Date is mandate")
	@Future(message="Loan Closure Date can not be past or current date")
	private LocalDate loanClosureDate;
	
	@NotNull(message="Monthly EMI payment is mandate")
	@NotBlank(message="Monthly EMI payment is mandate")
	@Min(value=1,message="Monthly EMI payment can not be negative or zero")
	private Double monthlyPayment;
	
	public Double getLoanAmountSanctioned() {
		return loanAmountSanctioned;
	}
	
	public void setLoanAmountSanctioned(Double loanAmountSanctioned) {
		this.loanAmountSanctioned = loanAmountSanctioned;
	}
	
	public Double getTermOfLoan() {
		return termOfLoan;
	}
	
	public void setTermOfLoan(Double termOfLoan) {
		this.termOfLoan = termOfLoan;
	}
	
	public LocalDate getPaymentStartDate() {
		return paymentStartDate;
	}
	
	public void setPaymentStartDate(LocalDate paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}
	
	public LocalDate getLoanClosureDate() {
		return loanClosureDate;
	}
	
	public void setLoanClosureDate(LocalDate loanClosureDate) {
		this.loanClosureDate = loanClosureDate;
	}
	
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public void setMonthlyPayment(Double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
