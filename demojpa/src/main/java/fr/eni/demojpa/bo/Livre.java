package fr.eni.demojpa.bo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(IdLivre.class)
public class Livre implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	@Id
	private String auteur;
	
	private LocalDate dateParution;
	private String isbn;		
}
