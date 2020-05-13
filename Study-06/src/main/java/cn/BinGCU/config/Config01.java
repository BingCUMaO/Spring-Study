package cn.BinGCU.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(value = {"cn.BinGCU.pojo", "cn.BinGCU.service"})
public class Config01 {

}
