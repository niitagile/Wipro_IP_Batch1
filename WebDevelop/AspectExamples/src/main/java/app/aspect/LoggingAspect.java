package app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
 
    @Around("execution(* app.service.impl.EmployeeManagerImpl.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable 
    {
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
 
    @Around("execution(* app.service.impl.EmployeeManagerImpl.getEmployeeById(..))") 
    public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws Throwable 
    {
        System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
 
    @Around("execution(* app.service.impl.EmployeeManagerImpl.createEmployee(..))")
    public void logAroundCreateEmployee(ProceedingJoinPoint joinPoint) throws Throwable 
    {
        System.out.println("****LoggingAspect.logAroundCreateEmployee() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println("****LoggingAspect.logAroundCreateEmployee() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
}