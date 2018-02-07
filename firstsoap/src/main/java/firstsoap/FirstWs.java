package firstsoap;

import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService
public class FirstWs {
	@WebMethod
public String sayHello(){
	return "First WS";
}
}
