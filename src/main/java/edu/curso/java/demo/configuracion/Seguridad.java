package edu.curso.java.demo.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.curso.java.demo.Service.UsuarioServiceImp;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(1)
public class Seguridad extends WebSecurityConfigurerAdapter{
	@Autowired
    private UsuarioServiceImp usuarioService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioService).passwordEncoder(new BCryptPasswordEncoder());
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().sameOrigin().and()
                .authorizeRequests()
                    .antMatchers("/css/*", "/js/*", "/img/*", "/**")
                    .permitAll()
                .and().formLogin()
                    .loginPage("/auth/login") // Que formulario esta mi login
                        .loginProcessingUrl("/logincheck")
                        .usernameParameter("username") // Como viajan losdatos del logueo
                        .passwordParameter("password")// Como viajan los datos del logueo
                        .defaultSuccessUrl("/inicio") // A que URL viaja
                        .permitAll()
                    .and().logout() // Aca configuro la salida
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/")
                        .permitAll().and().csrf().disable();
    }
    
}
