package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import bzh.eni.ecole.entity.Produit;

@CrossOrigin("*")

public interface ProduitRepository extends JpaRepository<Produit, Integer> {}