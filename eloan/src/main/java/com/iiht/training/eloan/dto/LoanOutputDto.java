package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoanOutputDto {	
	
	@NotNull(message="Customer id is mandatory")
	private Long customerId;
	
	@NotNull(message="Loan Application id is mandatory")
	private Long loanAppId;
	
	private UserDto userDto;	
	
	private LoanDto loanDto;	
	
	private ProcessingDto processingDto;	
	
	private SanctionOutputDto sanctionOutputDto;
	
	@NotBlank(message="Status is mandatory")
	@NotNull(message="Status is mandatory")
	private String status;
	
	@NotBlank(message="Remark is mandatory")
	@NotNull(message="Remark is mandatory")
	private String remark;
	 
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Long getLoanAppId() {
		return loanAppId;
	}
	
	public void setLoanAppId(Long loanAppId) {
		this.loanAppId = loanAppId;
	}
	
	public UserDto getUserDto() {
		return userDto;
	}
	
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	public LoanDto getLoanDto() {
		return loanDto;
	}
	
	public void setLoanDto(LoanDto loanDto) {
		this.loanDto = loanDto;
	}
	
	public ProcessingDto getProcessingDto() {
		return processingDto;
	}
	
	public void setProcessingDto(ProcessingDto processingDto) {
		this.processingDto = processingDto;
	}
	
	public SanctionOutputDto getSanctionOutputDto() {
		return sanctionOutputDto;
	}
	
	public void setSanctionOutputDto(SanctionOutputDto sanctionOutputDto) {
		this.sanctionOutputDto = sanctionOutputDto;
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
}
