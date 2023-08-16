package bzh.eni.ecole.bo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NamedQueries({
	@NamedQuery(name = "Personne.trouverTous",query = "SELECT p FROM Personne p"),
	@NamedQuery(name = "trouverUn",query = "SELECT p FROM Personne p WHERE p.id = :id")
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Personne implements Serializable{

	private static final long serialVersionUID = 1L;
	// Création un sequence commence de 1 et il s'incremente par 1 
	@Id
	@SequenceGenerator(name = "mon_sequence",
					   allocationSize = 1,
					   initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
			        generator = "mon_sequence")
	private Integer id;
	private String prenom;
	private String nom;
	private String adresse;
	private LocalDate dateNaissance;
	
}
