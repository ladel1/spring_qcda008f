package bzh.eni.ecole.bo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Film implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private int annee;
	private int duree;
	private String synopsis;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Genre genre;
	@ManyToOne(cascade = CascadeType.ALL)
	private Participant realisateur;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Participant> acteurs;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Avis> avis;
}
