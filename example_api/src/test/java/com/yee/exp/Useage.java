package com.yee.exp;

import com.yee.test.api.RemoteService;
import zcu.xutil.msg.Broker;
import zcu.xutil.util.Logger;

public class Useage {

    public static void main(String[] args) {
        Logger.LOG.info("begin.....");
        RemoteService remoteService = Broker.instance().create(RemoteService.class);
        Logger.LOG.info("call hello return:{}", remoteService.hello("client",1));

        remoteService.ansyCall(333,"ansync").setCallBack((r,t)->{
            Logger.LOG.info("ansyCall callback:{}",t,r);
        });

        Logger.LOG.info("waiting.....");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
