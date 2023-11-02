package com.mms.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.mms.entity.Medicine_entity;
import com.mms.entity.Order_entity;
import com.mms.model.Medicine_DTO;
import com.mms.model.Order_DTO;

@Component
public class Converter
{

//	convert from DTO to Entity
	public Order_entity convertToEntity(Order_DTO order_DTO) {

		Order_entity order_entity = new Order_entity();
		if (order_DTO != null) {
			BeanUtils.copyProperties(order_DTO, order_entity);
		}
		return order_entity;
	}

//	convert from  Entity to DTO
	public Order_DTO convertToDTO(Order_entity order_entity) {

		Order_DTO order_DTO = new Order_DTO();
		if (order_entity != null) {
			BeanUtils.copyProperties(order_entity, order_DTO);
		}
		return order_DTO;
	}

	// ---------------------------------------------------------------------------------------------------------

//	convert from DTO to Entity
	public Medicine_entity convertToMedicineEntity(Medicine_DTO Medicine_DTO) {

		Medicine_entity Medicine_entity = new Medicine_entity();
		if (Medicine_DTO != null) {
			BeanUtils.copyProperties(Medicine_DTO, Medicine_entity);
		}
		return Medicine_entity;
	}

//	convert from Entity to DTO
	public Medicine_DTO convertToMedicineDTO(Medicine_entity Medicine_entity) {

		Medicine_DTO Medicine_DTO = new Medicine_DTO();
		if (Medicine_entity != null) {
			BeanUtils.copyProperties(Medicine_entity, Medicine_DTO);

		}
		return Medicine_DTO;
	}

}
