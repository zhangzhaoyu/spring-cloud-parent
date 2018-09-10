package cn.cincout.distribute.spring.basic.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Aspect
@Slf4j
public class Audience {

    @Pointcut("execution(* cn.cincout.distribute.spring.basic.aop.Performance.perform(..))")
    public  void performance() {}

    @Before("execution(** cn.cincout.distribute.spring.basic.aop.Performance.perform(..))")
    public void silenceCellPhones() {
        log.info("Silencing cell phones");
    }

    @Before("execution(* cn.cincout.distribute.spring.basic.aop.Performance.perform(..))")
    public void takeSeats() {
        log.info("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        log.info("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        log.info("Demanding a refund");
    }

    /**
     * use @Around Advice
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            log.info("@Around Silencing cell phones");
            log.info("@Around Taking seats");
            proceedingJoinPoint.proceed();

            log.info("@Around CLAP CLAP CLAP");
        } catch (Throwable e) {
            log.info("@Around Demanding a refund");
            e.printStackTrace();
        }
    }
}
