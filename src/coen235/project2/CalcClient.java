package coen235.project2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		
		try {
			Calc cal=(Calc) Naming.lookup("rmi://localhost:8888/RCalc");
			
			String res="";
			String opcode="";
			int op1,op2 ;
			while(!res.equals("exit"))
			{
				
				System.out.println("continue/exit...");
				Scanner keyboard = new Scanner(System.in);
				res=keyboard.nextLine();
				switch(res)
				{
					case "exit":
						break;
					default:
						System.out.println("operation:");
						 opcode=keyboard.nextLine();
						System.out.println("first num:");
						 op1 = keyboard.nextInt();
						System.out.println("second num:");
						 op2 = keyboard.nextInt();
						System.out.println(cal.calculate(opcode, op1, op2));
						break;
				}
			
			}
			
			cal.exit();
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
