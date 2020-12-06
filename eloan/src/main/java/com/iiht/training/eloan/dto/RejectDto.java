package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RejectDto {
	
	@NotBlank(message="Remark is mandatory")
	@NotNull(message="Remark is mandatory")
	private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}	
}
