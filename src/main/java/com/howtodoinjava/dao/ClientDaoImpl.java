package com.howtodoinjava.dao;

import java.util.List;

import com.howtodoinjava.entity.ClientEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addClient(ClientEntity client) {
		this.sessionFactory.getCurrentSession().save(client);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClientEntity> getAllClients() {
		return this.sessionFactory.getCurrentSession().createQuery("from ClientEntity").list();
	}

	@Override
	public void deleteClient(Integer clientId) {
		ClientEntity client = (ClientEntity) sessionFactory.getCurrentSession().load(
				ClientEntity.class, clientId);
        if (null != client) {
        	this.sessionFactory.getCurrentSession().delete(client);
        }
	}
	
	

}
