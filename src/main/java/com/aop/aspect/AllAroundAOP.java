package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AllAroundAOP {

    @Around("execution(* com.aop.dao.saveAccount(..))")
    public void trackMethodAllAround(JoinPoint joinPoint) {

    }

}
