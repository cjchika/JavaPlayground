package com.cjchika.jobapp_rest_api.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.cjchika.jobapp_rest_api.service.JobService.getAllJobs*(..)) &&  args(postId")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {

        if(postId < 0){
            LOGGER.info("PostId is negative, updating it.");
            postId = -postId;
            LOGGER.info("New value." + postId);
        }

        return jp.proceed(new Object[]{postId});
    }
}