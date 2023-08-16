package bzh.eni.ecole.bo;

import java.io.Serializable;

public class Membre implements Serializable {

	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private boolean isAdmin;
	
}
