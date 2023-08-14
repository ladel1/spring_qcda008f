package fr.eni.demojpa.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.eni.demojpa.bo.Client;

public interface ClientDao extends JpaRepository<Client, Integer> {

}
