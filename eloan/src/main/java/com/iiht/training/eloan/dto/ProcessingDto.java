package com.iiht.training.eloan.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class ProcessingDto {	
	
	@NotNull(message="Acres Of Land is mandatory")
	@Min(value=1, message="Acres Of Land can not be negative or zero")
	private Double acresOfLand;
		
	@NotNull(message="Land Value is mandatory")
	@Min(value=1, message="Land Value can not be negative or zero")
	private Double landValue;
	
	@NotBlank(message="Appraised By is mandatory")
	@NotNull(message="Appraised By is mandatory")
	private String appraisedBy;
		
	@NotNull(message="Valuation Date is mandatory")
	@Future(message="Valuation Date cannot be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate valuationDate;
	
	@NotBlank(message="Address Of Property is mandatory")
	@NotNull(message="Address Of Property is mandatory")
	private String addressOfProperty;
		
	@NotNull(message="Suggested Amount Of Loan is mandatory")
	@Min(value=1, message="Suggested Amount Of Loan can not be negative or zero")
	private Double suggestedAmountOfLoan;
	
	public Double getAcresOfLand() {
		return acresOfLand;
	}
	
	public void setAcresOfLand(Double acresOfLand) {
		this.acresOfLand = acresOfLand;
	}
	
	public Double getLandValue() {
		return landValue;
	}
	
	public void setLandValue(Double landValue) {
		this.landValue = landValue;
	}
	
	public String getAppraisedBy() {
		return appraisedBy;
	}
	
	public void setAppraisedBy(String appraisedBy) {
		this.appraisedBy = appraisedBy;
	}
	
	public LocalDate getValuationDate() {
		return valuationDate;
	}
	
	public void setValuationDate(LocalDate valuationDate) {
		this.valuationDate = valuationDate;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public Double getSuggestedAmountOfLoan() {
		return suggestedAmountOfLoan;
	}
	public void setSuggestedAmountOfLoan(Double suggestedAmountOfLoan) {
		this.suggestedAmountOfLoan = suggestedAmountOfLoan;
	}
	
	
}
