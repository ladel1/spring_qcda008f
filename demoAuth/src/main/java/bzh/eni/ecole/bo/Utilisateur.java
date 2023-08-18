package bzh.eni.ecole.bo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Utilisateur implements UserDetails {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private List<String> roles;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantedAuthliste = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			grantedAuthliste.add( new SimpleGrantedAuthority(role) );
		}
		return grantedAuthliste;
	}
	
	@Override
	public boolean isAccountNonExpired() {		
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {		
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}		
}
