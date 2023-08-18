package bzh.eni.ecole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityAuthWeb {

	/**
	 * Configurer Auth 
	 * @param http
	 * @return
	 * @throws Exception
	 */
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {		
		System.err.println("securityFilterChain started ****");
		return http.authorizeHttpRequests(auth->{
					auth.requestMatchers("/mon-compte/**").authenticated();
					auth.anyRequest().permitAll();
				})
				.formLogin(Customizer.withDefaults())
				.build();		
	}
	/**
	 * pour chiffrage du mot de passe avec l'algorithme BCrypt
	 * @return
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		System.err.println("passwordEncoder started ****");
		return new BCryptPasswordEncoder();
	}
	
}
