package com.tangyao.authority.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
@Aspect
public class RedisAop {

    @Pointcut("execution(public * com.tangyao.authority.util.*.*(..))")
    public void redisMethodPointcut() {

    }

    @Around("redisMethodPointcut()")
    public Object Interceptor(JoinPoint pjp) {
        Signature signature = pjp.getSignature();
        Class<?> aClass = pjp.getTarget().getClass();
        Annotation[] annotations = aClass.getAnnotations();
        return null;



    }


}
