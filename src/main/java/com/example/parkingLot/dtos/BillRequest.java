package com.example.parkingLot.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BillRequest {

	@NotEmpty(message = "Customer number is required")
	@Valid
	private String receiptId;

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
}
