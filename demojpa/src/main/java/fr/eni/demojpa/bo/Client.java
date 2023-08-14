package fr.eni.demojpa.bo;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CLIENTS")
@Data
@NoArgsConstructor
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	@Column(length = 30)
	@Length(
			min=2,
			max=30,
			message="Le champs Prénom doit être entre 2 et 30 caractères"
			)
	private String firstname;
	@Column(length = 30)
	@Length(
			min=2,
			max=30,
			message="Le champs Nom doit être entre 2 et 30 caractères"
			)	
	private String lastname;
	@Column(length = 60)
	@Length(
			min=5,
			max=60,
			message="Le champs Adresse doit être entre 5 et 60 caractères"
			)	
	private String address;
	//@Pattern(regex="", flag="", message="")
	@Column(length = 10)
	@Length(
			min=4,
			max=10,
			message="Le champs Téléphone doit être entre 4 et 10 caractères"
			)	
	private String tel;
	@Past(message = "La date de naissance doit être dans le passé")	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate bday;
	
}
