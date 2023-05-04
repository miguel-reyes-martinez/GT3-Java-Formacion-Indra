package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspecto.InformingAspect;
import aspecto.LoggingAspect;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan("Funciones")
public class AspectConfig {
	@Bean
	public LoggingAspect resgitrarUsuarios() {
		return new LoggingAspect();
	}
	
	@Bean
	public InformingAspect informarMetodo() {
		return new InformingAspect();
	}
}