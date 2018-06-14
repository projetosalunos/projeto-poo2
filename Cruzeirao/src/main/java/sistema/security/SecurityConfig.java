package sistema.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("normal").password("123456").roles("NORMAL");
        auth.inMemoryAuthentication().withUser("adm").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("mestre").password("123456").roles("MESTRE");
    }

    //@Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	//Controle feito pelo JSF
    	http.csrf().disable();
    	    	
    	//Página de acesso negado
        http.exceptionHandling().accessDeniedPage("/acessonegado.xhtml");
        
        //Libera todos os recursos do JSF
        http.authorizeRequests().antMatchers("/javax.faces.resource/**").permitAll();
        
        //Controla o acesso a página protegida  do adm e superadmin        
       	http.authorizeRequests().antMatchers("/pages/adm/**")
     	          .access("hasRole('ADMIN') or hasRole('MESTRE')");
             
        
        http.authorizeRequests().antMatchers("/pages/adm/**").hasRole("MESTRE");        
        
		
    	
    	//Login
    	http.formLogin().loginPage("/login.xhtml").permitAll()
		.defaultSuccessUrl("/pages/sistema.xhtml", true)
		.failureUrl("/login.xhtml?error=true")
		.usernameParameter("username")
		.passwordParameter("password");
    	
    	http.authorizeRequests().antMatchers("/cadastroPessoa.xhtml").permitAll();
    	
    	//Logout
        http.logout().logoutUrl("/logout")
                     .logoutSuccessUrl("/login.xhtml");

        // Todas as requisições para partes internas da aplicação devem ser autenticadas
		http.authorizeRequests().anyRequest().authenticated();
    	
    	
    	
        
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
        web.ignoring().antMatchers("/javax.faces.resource/**");
    }
}

