package cn.BinGCU.aspect;

public class CarAspect {
    public void before(){
        System.out.println("In Before Method：前期准备工程");
    }

    public void after(){
        System.out.println("In After Method：施工完毕，开车运走");
    }

    public void returningAfter(){
        System.out.println("In returningAfter Method：全部结束");
    }
}
