package com.mms.service;

import java.util.List;

import com.mms.entity.Order_entity;
import com.mms.model.Order_DTO;

public interface Order_service 
{
//	for create new order
	Order_DTO createOrder(Order_entity order_entity);

//	fetch all order data
	List<Order_DTO> getAllOrder();

//	fetch by id
	Order_DTO getOrderById(int id);

//	update by id
	Order_DTO updateById(int id, Order_entity order_entity);

//	delete by id
	String deleteById(int id);

	

}
