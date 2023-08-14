package fr.eni.demojpa.bo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private IdArticle id;
	private String categorie;
	private Float prix;
	
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Comment> comments;
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}	
	
}
