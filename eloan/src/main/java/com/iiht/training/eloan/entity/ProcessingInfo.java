package com.iiht.training.eloan.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProcessingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="loan_app_id", nullable=true, unique=true)
	private Long loanAppId;
	
	@Column(name="loan_clerk_id", nullable=true, unique=true)
	private Long loanClerkId;
	
	@Column(name="acres_of_land", nullable=true, unique=true)
	private Double acresOfLand;
	
	@Column(name="land_value", nullable=true, unique=true)
	private Double landValue;
	
	@Column(name="appraised_by", nullable=true, unique=true)
	private String appraisedBy;
	
	@Column(name="valuation_date", nullable=true, unique=true)
	private LocalDate valuationDate;
	
	@Column(name="address_of_property", nullable=true, unique=true)
	private String addressOfProperty;
	
	@Column(name="suggested_amount_of_loan", nullable=true, unique=true)
	private Double suggestedAmountOfLoan;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="loan_id")
	private Loan processLoan;
		
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getLoanAppId() {
		return loanAppId;
	}
	
	public void setLoanAppId(Long loanAppId) {
		this.loanAppId = loanAppId;
	}
	
	public Long getLoanClerkId() {
		return loanClerkId;
	}
	
	public void setLoanClerkId(Long loanClerkId) {
		this.loanClerkId = loanClerkId;
	}
	
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
	
	public Loan getLoan() {
		return processLoan;
	}

	public void setLoan(Loan processLoan) {
		this.processLoan = processLoan;
	}
}
