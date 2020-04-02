package com.chivisgt.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chivisgt.models.dao.IPersonaDao;
import com.chivisgt.models.entity.Cliente;
@Service
public class IClienteServiceImpl implements IClienteService {
    @Autowired
    private IPersonaDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
	
		return (List<Cliente>)clienteDao.findAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
		
	}

	@Override
	@Transactional(readOnly=true)

	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).get();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	
		
	}

}
