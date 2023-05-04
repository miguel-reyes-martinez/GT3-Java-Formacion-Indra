package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class InformingAspect {

  @Before("execution(* crearUsuario(..))")
  public void inicioEjecutarMetodo(JoinPoint joinPoint) {
	String username = System.getProperty("user.name");
    System.out.println("El usuario " + username + " está ejecutando el método " + joinPoint.getSignature().getName());
  } 
  
  @After("execution(* crearUsuario(..))")
  public void finEjecutarMetodo(JoinPoint joinPoint) {
	String username = System.getProperty("user.name");
    System.out.println("El usuario " + username + " terminó de ejecutar el método " + joinPoint.getSignature().getName() + "\n");
  } 

}