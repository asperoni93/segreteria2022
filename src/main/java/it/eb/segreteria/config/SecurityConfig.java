package it.eb.segreteria.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@ComponentScan("it.eb.segreteria")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**")  

        .authorizeRequests().antMatchers("/").permitAll()
        .and().authorizeRequests().antMatchers("/").hasAnyAuthority("ADMIN","USER")
        .and().authorizeRequests().antMatchers("/users/**").hasAnyAuthority("ADMIN")
        .and().authorizeRequests().antMatchers("/test").permitAll()
        .anyRequest().authenticated()
        .and().formLogin(); 
	}
	
	@Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("SELECT email,password,1 FROM users where email=?")
			.authoritiesByUsernameQuery("SELECT email, authority FROM roles where email=?")
			.passwordEncoder(encoder());

//        System.out.println(encoder().encode("1234"));
    }
	
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	

}

