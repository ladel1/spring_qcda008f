package bzh.eni.ecole.bo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Avis implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private int note;
	private String commentaire;
	private Film film;
	private Membre membre;
	
}
