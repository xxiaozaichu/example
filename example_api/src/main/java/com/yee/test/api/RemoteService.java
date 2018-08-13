package com.yee.test.api;

import zcu.xutil.msg.GroupService;
import zcu.xutil.msg.Result;

@GroupService
public interface RemoteService {
	Object hello(String str, int i);
	Result<String> ansyCall(int i, String str);
}
