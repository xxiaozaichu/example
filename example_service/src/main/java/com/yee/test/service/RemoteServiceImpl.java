package com.yee.test.service;


import com.yee.test.api.RemoteService;
import zcu.xutil.msg.Broker;
import zcu.xutil.msg.Result;
import zcu.xutil.util.Logger;


import java.util.Date;



public class RemoteServiceImpl implements RemoteService {
	private static final Logger logger = Logger.getLogger(RemoteServiceImpl.class);

	
	public Object hello(String str,int i)  {
		logger.info("{}  server hello, num: {}",str,i);
		int m = i % 5;
		return m == 0 ? i : m==1 ? str : m==2 ? new Date() : m==3 ? new byte[]{} : null;
	}


	public Result<String> ansyCall(int i, String str){
		logger.info("asyncall param: {} {}", i,str);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return new Result<>(str + "  return " +   i);
		
	}

	public static void main(String[] args) {
		Broker.instance().startServer(new RemoteServiceImpl());
	}
}
