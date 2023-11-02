package com.mms.model;

import java.util.List;

import com.mms.entity.Order_entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicine_DTO
{

	
	private int Medicine_id;
	
	private String Medicine_name;

	private String customer_address;
	
	private int customer_phone;


	private boolean status = Boolean.TRUE;

	List<Order_entity> orders;
}
