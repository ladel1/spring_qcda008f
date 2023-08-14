package fr.eni.demojpa.bo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nom_rue",length = 30)
	private String nomRue;
	@Column(name = "num_rue")
	private Integer numRue;	
	private String ville;
	@Column(length = 5)	
	private String cp;
	@OneToOne(mappedBy = "address")
	@ToString.Exclude
	private Client client;
	
}
