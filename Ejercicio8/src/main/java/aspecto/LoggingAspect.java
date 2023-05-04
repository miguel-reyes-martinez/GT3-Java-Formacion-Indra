package aspecto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {


	@Around("execution(* registrarUsuarios(..))")
	  public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    long start = System.currentTimeMillis();
	    Object result = joinPoint.proceed();
	    long executionTime = System.currentTimeMillis() - start;
	    System.out.println(String.format("El método %s ha registrado a todos los usuarios en %d ms", joinPoint.getSignature().getName(), executionTime));
	    return result;
	  }
}
