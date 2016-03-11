package coen235.project2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class CalClient {

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
						System.out.println("operation firstNum secondNum");
						String s=keyboard.nextLine();
						String[] ss=s.split("\\s+");
						 opcode=ss[0];
						 op1 = Integer.parseInt(ss[1]);
						 op2 = Integer.parseInt(ss[2]);
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
