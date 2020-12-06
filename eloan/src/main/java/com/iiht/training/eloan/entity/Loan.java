package com.iiht.training.eloan.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;
	
	/*
	 * @Column(name="customer_id")
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long customerId;
	 */
	
	@Column(name="loan_name", nullable=true, unique=true)
	private String loanName;
	
	@Column(name="loan_amount", nullable=true)
	private Double loanAmount;
	
	@Column(name="loan_application_date", nullable=true)
	private LocalDate loanApplicationDate;
	
	@Column(name="business_structure", nullable=true)
	private String businessStructure;
	
	@Column(name="billing_indicator", nullable=true)
	private String billingIndicator;
	
	@Column(name="tax_indicator", nullable=true)
	private String taxIndicator;
	
	@Column(name="status", nullable=true)
	private String status;
	
	@Column(name="remark", nullable=true)
	private String remark;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="customer_id")
	private Users user;
	
	@OneToOne(mappedBy = "processLoan")
	private ProcessingInfo processLoan;	
	
	@OneToOne(mappedBy = "sanctionLoan")
	private SanctionInfo loan;
	
	public Long getLoanId() {
		return loanId;
	}
	
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	
	/*
	 * public Long getCustomerId() { return customerId; }
	 * 
	 * public void setCustomerId(Long customerId) { this.customerId = customerId; }
	 */
	
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
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
