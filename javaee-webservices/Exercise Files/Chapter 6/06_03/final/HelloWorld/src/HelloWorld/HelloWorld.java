package HelloWorld;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;
@MTOM
@WebService(name="newname")
public class HelloWorld {
	public void constructor() {
		
	}
	@XmlMimeType("[name]") DataHandler data;
	@WebMethod(action="sample", operationName="name")
	public String Hello(String s) {
		return "Hello " + s;
	}

}
