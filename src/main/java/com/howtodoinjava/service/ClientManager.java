package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.ClientEntity;

public interface ClientManager {
	public void addClient(ClientEntity client);
    public List<ClientEntity> getAllClients();
    public void deleteClient(Integer clientId);
}
