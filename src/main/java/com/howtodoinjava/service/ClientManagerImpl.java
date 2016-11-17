package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.dao.ClientDAO;
import com.howtodoinjava.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientManagerImpl implements ClientManager {
	
	@Autowired
    private ClientDAO clientDAO;

	@Override
	@Transactional
	public void addClient(ClientEntity employee) {
		clientDAO.addClient(employee);
	}

	@Override
	@Transactional
	public List<ClientEntity> getAllClients() {
		return clientDAO.getAllClients();
	}

	@Override
	@Transactional
	public void deleteClient(Integer clientId) {
		clientDAO.deleteClient(clientId);
	}

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}
}
