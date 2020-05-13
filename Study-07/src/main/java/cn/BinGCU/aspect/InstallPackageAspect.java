package cn.BinGCU.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//@Aspect里面的参数value不是指<aspect/> 标签的id名
@Aspect
public class InstallPackageAspect {

    @Pointcut("execution(* cn.BinGCU.service.InstallPackage.*(..))")
    private void install(){}

    @Before("install()")
    public void beforeInstall(){
        System.out.println("In beforeInstall method：安装前先仔细检查布线");
    }

    @After("install()")
    public void afterInstall(){ //这里不能加参数  ProceedingJoinPoint jp，只有环形增强能加，貌似
        System.out.println("In afterInstall：安装完了，检查测试！！！" );
    }
}
