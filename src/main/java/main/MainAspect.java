package main;

import aop.Calculator;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
            = new AnnotationConfigApplicationContext(AppCtx.class);
        Calculator cal = ctx.getBean("calculator", Calculator.class);

        cal.factorial(7);
        cal.factorial(7);
        cal.factorial(5);
        cal.factorial(5);

        ctx.close();
    }
}
