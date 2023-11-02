package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.entity.Medicine_entity;

public interface Medicine_Repository extends JpaRepository<Medicine_entity, Integer>
{

}
