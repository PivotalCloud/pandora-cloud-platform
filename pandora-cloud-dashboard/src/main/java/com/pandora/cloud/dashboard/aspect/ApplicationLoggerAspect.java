package com.pandora.cloud.dashboard.aspect;

import com.pandora.cloud.common.logger.aspect.ApplicationAspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>封装Qicloud项目ApplicationLoggerAspect类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 20:10
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Component
@Aspect
@Slf4j
public class ApplicationLoggerAspect implements ApplicationAspect {


    @Pointcut("@annotation(com.pandora.cloud.common.logger.annotation.ApplicationLogger)")
    @Override
    public void pointcut() {
        // 该方法无方法体,主要为了让同类中其他方法使用此切入点
    }

    @Around("pointcut()")
    @Override
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        return null;
    }


    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    @Override
    public void exception(JoinPoint joinPoint, Throwable exception) {

    }


}
