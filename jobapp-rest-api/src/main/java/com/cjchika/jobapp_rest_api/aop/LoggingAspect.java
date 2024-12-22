package com.cjchika.jobapp_rest_api.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.cjchika.jobapp_rest_api.service.JobService.getAllJobs*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called!" + jp.getSignature().getName());
    }

    @After("execution(* com.cjchika.jobapp_rest_api.service.JobService.getAllJobs*(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed!" + jp.getSignature().getName());
    }
}
