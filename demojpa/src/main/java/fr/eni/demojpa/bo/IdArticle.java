package fr.eni.demojpa.bo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class IdArticle implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nom;
	private String proprio;
	
}
