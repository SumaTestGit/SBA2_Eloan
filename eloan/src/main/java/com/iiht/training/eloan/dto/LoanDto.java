package com.iiht.training.eloan.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class LoanDto {	
	
	private Long loanId;
		
	private Long customerId;

	@NotNull(message="Loan Name is mandatory")
	@NotBlank(message="Loan Name is mandatory")
	private String loanName;
	
	@NotNull(message="Loan Amount is mandatory")
	@Min(value=1, message="Loan Amount can not be negative or zero")
	private Double loanAmount;
	
	@NotNull(message="Loan Application Date is mandatory")	
	@PastOrPresent(message="Loan Application Date can not be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate loanApplicationDate;
	
	@NotNull(message="Business Structure is mandatory")
	@NotBlank(message="Business Structure is mandatory")
	private String businessStructure;
	
	@NotNull(message="Billing Indicator is mandatory")
	@NotBlank(message="Billing Indicator is mandatory")
	private String billingIndicator;
	
	@NotNull(message="Tax Indicator is mandatory")
	@NotBlank(message="Tax Indicator is mandatory")
	private String taxIndicator;
	
	@NotNull(message="Status is mandatory")
	@NotBlank(message="Status is mandatory")
	private String status;
	
	@NotNull(message="Remark is mandatory")
	@NotBlank(message="Remark is mandatory")
	private String remark;
	
	private UserDto user;
	
	public Long getLoanId() {
		return loanId;
	}
	
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public String getLoanName() {
		return loanName;
	}
	
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	
	public Double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public LocalDate getLoanApplicationDate() {
		return loanApplicationDate;
	}
	
	public void setLoanApplicationDate(LocalDate loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}
	
	public String getBusinessStructure() {
		return businessStructure;
	}
	
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	
	public String getBillingIndicator() {
		return billingIndicator;
	}
	
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
	}
	
	public String getTaxIndicator() {
		return taxIndicator;
	}
	
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}		
}
