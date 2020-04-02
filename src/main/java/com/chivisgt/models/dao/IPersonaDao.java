package com.chivisgt.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.chivisgt.models.entity.Cliente;

public interface IPersonaDao extends PagingAndSortingRepository<Cliente,Long>{

}
