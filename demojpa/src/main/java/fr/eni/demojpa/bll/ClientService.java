package fr.eni.demojpa.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.demojpa.bo.Client;
import fr.eni.demojpa.dal.ClientDao;

@Service
public class ClientService {

	@Autowired
	private ClientDao clientDao;
	
	public void addClient(Client client) {
		clientDao.save(client);
	}
	
	public Client findOne(Integer id) {
		return clientDao.findById(id).get();
	}
	
	public List<Client> findAll(){
		return clientDao.findAll();
	}
	
}
