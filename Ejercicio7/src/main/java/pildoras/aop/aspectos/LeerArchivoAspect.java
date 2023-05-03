package pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LeerArchivoAspect {

	@Before("execution(public void leer())")
	public void estaPorSLeer()
	{
		System.out.println("Leyendo archivo...");
	}
}

