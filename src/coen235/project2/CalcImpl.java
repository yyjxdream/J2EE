package coen235.project2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements Calc{

	protected CalcImpl() throws RemoteException {
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int calculate(String opcode, int op1, int op2) throws RemoteException {
		int result;
		switch(opcode)
		{
			case "+":
				result=op1+op2;
				break;
			case "-":
				result=op1-op2;
				break;
			case "*":
				result=op1*op2;
				break;
			case "/":
				result=op1/op2;
				break;
			case "exit":
				result=-1;
				exit();
				break;
			default:
				result=op1+op2;
				break;
		}
			
		return result;
	}

	@Override
	public int exit() throws RemoteException {
		 try{
		        // Unregister ourself
		        Naming.unbind("rmi://localhost:8888/RCalc");

		        // Unexport; this will also remove us from the RMI runtime
		        UnicastRemoteObject.unexportObject(this, true);

		        System.out.println("CalculatorServer exiting.");
		        return 1;
		    }
		    catch(Exception e){
		    	return 0;
		    }
//		System.exit(0);
//		return 0;
	}

}
