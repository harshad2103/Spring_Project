package com.mms.service;

import com.mms.entity.Medicine_entity;
import com.mms.model.Medicine_DTO;

public interface Medicine_service
{


	String assigningOrderToMedicine(int Medicine_id, int order_id);

	Medicine_DTO registerMedicine(Medicine_entity Medicine_entity);

}
