package first;

import static zcu.xutil.util.Objutil.validate;

import java.util.Collections;

import javax.servlet.http.HttpSession;

import zcu.xutil.web.*;

public class TestConfig extends ActionConfig {

	@Override
	public void config() {
		map("/action?", b -> View.forward("/action.b.html"));
		map("/test.json", b -> View.json(Collections.singletonMap("username", "xzcxzc1234")));
		map("/text", b -> View.text(b.getContext().listMe().toString(),null));
		map("/a.b.c/text", b -> View.text(b.getContext().listMe().toString(),null));
		
		map("/fail", b -> View.forward("/fail"));


		
		map("/from" , b->{   
			HttpSession s = b.getRequest().getSession();
			s.setAttribute("savedurl", b.getRequest().getRequestURL().toString());
			b.getResponse().sendRedirect("/login.b.html/webapp;jsessionid="+s.getId());
			return null;
		});
		
		SSOLoginAction log = map("/login.b.html",new SSOLoginAction("dev.com"));
		map("/logout",log::logout);

		map("/queryOrder.b.html" , this::orderQuery);

	}

	View orderQuery(ActionContext ac){
		//

		return View.THIS;

	}
}
