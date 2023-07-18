package com.tryc.dubbo.provider;

import com.tryc.dubbo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Random;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        Random random = new Random();
        return "hello-" + random.nextInt(10000) + name;
    }
}
