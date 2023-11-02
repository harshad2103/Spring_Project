package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.entity.Order_entity;

public interface Order_Repository extends JpaRepository<Order_entity, Integer>
{

}
