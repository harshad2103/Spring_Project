package com.mms.model;

import com.mms.entity.Medicine_entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Order_DTO 
{

	
	@NotNull
	private int order_id;
	
	@NotNull
	@Size(min = 2, max = 35, message = "Your Order should be Minimum 2....")
	private String order_name;
	
	@NotNull
	@Size(min = 5, max = 100, message = "Your Quantity should be Minimum 5....")
	private int order_quantity;
	
	@NotNull
	private int order_price;

	private Medicine_entity customer;
}
