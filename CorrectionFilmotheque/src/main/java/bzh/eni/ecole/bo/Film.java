package bzh.eni.ecole.bo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor
public class Film implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titre;
	private int annee;
	private int duree;
	private String synopsis;
	
	private Genre genre;
	
	private Participant realisateur;
	private List<Participant> acteurs;
	
	private List<Avis> avis;
}
