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
@DiscriminatorColumn(name = "type")
@DiscriminatorValue(value = "Pers")
@Data @AllArgsConstructor @NoArgsConstructor
public class Personne implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String prenom;
	private String nom;
	private String adresse;
	private LocalDate dateNaissance;
	
}
