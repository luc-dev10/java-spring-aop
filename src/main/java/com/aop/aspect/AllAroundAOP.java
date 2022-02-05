package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AllAroundAOP {

    // logger
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.aop.dao.AccountDAO.saveAccount(..))")
    public Object trackMethodAllAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // start
        double begin = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        // calculate execution time
        double end = System.currentTimeMillis();
        double duration = (end - begin) / 1000;

        // print with format
        logger.info(String.valueOf(duration));

        return result;
    }

}
