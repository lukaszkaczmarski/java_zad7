package com.howtodoinjava.controller;

import com.howtodoinjava.entity.ClientEntity;
import com.howtodoinjava.service.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClientController {
	
	@Autowired
	private ClientManager clientManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listClient(ModelMap map)
	{
		map.addAttribute("client", new ClientEntity());
		map.addAttribute("clientList", clientManager.getAllClients());
		
		return "clientList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute(value="client") ClientEntity client, BindingResult result)
	{
		clientManager.addClient(client);
		return "redirect:/";
	}

	@RequestMapping("/delete/{clientId}")
	public String deleteClient(@PathVariable("clientId") Integer clientId)
	{
		clientManager.deleteClient(clientId);
		return "redirect:/";
	}

	public void setClientManager(ClientManager clientManager) {
		this.clientManager = clientManager;
	}
}
