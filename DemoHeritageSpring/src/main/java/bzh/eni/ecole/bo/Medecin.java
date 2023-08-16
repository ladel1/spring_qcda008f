package bzh.eni.ecole.bo;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value = "m")
@Data @AllArgsConstructor @NoArgsConstructor
public class Medecin extends Personne {

	private float tarif;
	private String specialite;
	
}
