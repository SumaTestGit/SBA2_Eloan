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
import javax.persistence.Table;

@Entity
@Table(name="sanction_info")
public class SanctionInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Long id;
	
	@Column(name="loan_app_id", nullable=true, unique=true)
	private Long loanAppId;
	
	@Column(name="manager_id", nullable=true, unique=true)
	private Long managerId;
	
	@Column(name="loan_amount_sanctioned", nullable=true, unique=true)
	private Double loanAmountSanctioned;
	
	@Column(name="loan_term", nullable=true, unique=true)
	private Double termOfLoan;
	
	@Column(name="payment_start_date", nullable=true, unique=true)
	private LocalDate paymentStartDate;
	
	@Column(name="loan_closure_date", nullable=true, unique=true)
	private LocalDate loanClosureDate;
	
	@Column(name="monthly_payment", nullable=true, unique=true)
	private Double monthlyPayment;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="loan_id")
	private Loan sanctionLoan;
	
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
	
	public Long getManagerId() {
		return managerId;
	}
	
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	
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
	
	public Loan getSanctionLoan() {
		return sanctionLoan;
	}

	public void setSanctionLoan(Loan sanctionLoan) {
		this.sanctionLoan = sanctionLoan;
	}

}
