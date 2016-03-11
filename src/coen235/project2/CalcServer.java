package coen235.project2;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalcServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Calc cal=new CalcImpl();
			LocateRegistry.createRegistry(8888);
			
			Naming.bind("rmi://localhost:8888/RCalc", cal);
			 System.out.println("INFO:Remote object bind Successful!"); 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
