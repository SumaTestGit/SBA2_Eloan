package com.iiht.training.eloan.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class SanctionDto {
	
	@NotNull(message="Loan Amount Sanctioned is mandate")
	@NotBlank(message="Loan Amount Sanctioned is mandate")
	@Size(min=0,message="Loan Amount Sanctioned can not be negative or zero")
	private Double loanAmountSanctioned;
	
	@NotNull(message="Term Of Loan is mandate")
	@NotBlank(message="Term Of Loan is mandate")
	@Size(min=0,message="Term Of Loan can not be negative or zero")
	private Double termOfLoan;
	
	@PastOrPresent(message="Investor DOB can not be a future date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate paymentStartDate;
	
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
	
	
}
