package com.dylan.vanguard.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http ) throws Exception{

        // return http.build();
       
       return http.authorizeHttpRequests(request -> request.anyRequest().authenticated())
        // .csrf(customizer -> customizer.disable())
        .httpBasic(Customizer.withDefaults())
        .formLogin(Customizer.withDefaults())
        .build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 = User.withDefaultPasswordEncoder()
        .username("joey")
        .password("1234")
        .roles("USER")
        .build();

        UserDetails user2 = User.withDefaultPasswordEncoder()
        .username("melay")
        .password("mell")
        .roles("ADMIN")
        .build();

        return new InMemoryUserDetailsManager(user1,user2);
    }
}
