package bzh.eni.ecole.dal;

import java.util.List;

import bzh.eni.ecole.bo.Personne;

public interface PersonneDaoCustom {
	Personne findPersonneParPrenom(String prenom);
	Personne trouverUn(Integer id);
	
}
