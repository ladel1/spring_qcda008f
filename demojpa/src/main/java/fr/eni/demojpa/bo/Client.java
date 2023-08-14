package fr.eni.demojpa.bo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	private String firstname;
	@Column(length = 30)
	private String lastname;
	@Column(length = 60)
	private String address;
	@Column(length = 10)
	private String tel;	
	private LocalDate bday;
	
}
