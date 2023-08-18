package bzh.eni.ecole.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http.authorizeHttpRequests(auth->{
					auth.requestMatchers("/prive").authenticated();
					auth.requestMatchers("/admin").hasRole("ADMIN");// ROLE_ADMIN
					auth.anyRequest().permitAll();
				})
				.formLogin(Customizer.withDefaults())						
				.build();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails adel = User.withDefaultPasswordEncoder()
//							   .username("adel")
//							   .password("123456")
//							   .roles("membre")
//							   .build();
//		UserDetails gaelle = User.withDefaultPasswordEncoder()
//				.username("gaelle")
//				.password("123456")
//				.roles("ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(adel,gaelle);
//	}
		
	@Bean
	public PasswordEncoder paswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
