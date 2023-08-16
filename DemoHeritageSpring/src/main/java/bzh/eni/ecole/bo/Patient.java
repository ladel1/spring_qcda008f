package bzh.eni.ecole.bo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value = "pat")
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient extends Personne {
	private String nss;
	private String diagnostic;		
}
