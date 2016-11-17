package com.howtodoinjava.dao;

import java.util.List;

import com.howtodoinjava.entity.ClientEntity;

public interface ClientDAO
{
    public void addClient(ClientEntity client);
    public List<ClientEntity> getAllClients();
    public void deleteClient(Integer cliendId);
}