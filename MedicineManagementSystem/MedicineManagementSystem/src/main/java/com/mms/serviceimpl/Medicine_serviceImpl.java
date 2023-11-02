package com.mms.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mms.entity.Medicine_entity;
import com.mms.entity.Order_entity;
import com.mms.exception.ResourceNotFoundException;
import com.mms.model.Medicine_DTO;
import com.mms.repository.Medicine_Repository;
import com.mms.repository.Order_Repository;
import com.mms.service.Medicine_service;
import com.mms.utility.Converter;

@Service
public class Medicine_serviceImpl implements Medicine_service
{

	@Autowired
	private Medicine_Repository Medicine_Repository1;

	@Autowired
	private Order_Repository order_repository;

	@Autowired
	private  Medicine_Repository Medicine_Repository;

	@Autowired
	private Converter converter;

	@Override
	public Medicine_DTO registerMedicine(Medicine_entity Medicine_entity) {
		return converter.convertToMedicineDTO(Medicine_Repository1.save(Medicine_entity));
	}

	
	@Override
	public String assigningOrderToMedicine(int Medicine_id, int order_id) {
		Order_entity order_entity = order_repository.findById(order_id).orElseThrow(() -> new ResourceNotFoundException("Order ", " order_id ", order_id));

		Medicine_entity Medicine_entity = Medicine_Repository1.findById(Medicine_id).orElseThrow(() -> new ResourceNotFoundException("Order ", " order_id ", Medicine_id));

		List<Order_entity> orders = new ArrayList<>();
		orders.add(order_entity);

		Medicine_entity.setOrders(orders);
		order_entity.setMedicine(Medicine_entity);

		Medicine_Repository1.save(Medicine_entity);

		return "Order assigned to a Medicine Successfully.....";
	}
}
