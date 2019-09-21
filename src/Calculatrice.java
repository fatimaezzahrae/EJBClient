



import javax.naming.Context;
import javax.naming.InitialContext;

import ma.jit.tpjndi.service.ICalculRemote;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {
	            Context ctx = new InitialContext();
	            ICalculRemote proxy = (ICalculRemote)ctx.lookup("ejb:/TPJNDI/cl!ma.jit.tpjndi.service.ICalculRemote");
	            System.out.println(proxy.additonner(10, 5));
	            
	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	}

}
