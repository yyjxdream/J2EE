package coen235.project2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String res="";
		
		
		//outerloop:
		while(!res.equals("exit"))
		{
			System.out.println("input...");
			Scanner s=new Scanner(System.in);
			res=s.nextLine();
			switch(res)
			{
				case "exit":
					System.out.println("Request for disconnect.");
					break;
				default:
					System.out.println("Calculating result and sending answer....\n");
					String opcode=s.nextLine();
					//if(opcode.equals("exit"))
						//break outerloop;					
					int op1=s.nextInt();	
					int op2=s.nextInt();
					System.out.println(op1+opcode+op2);
					break;
					
			}
		}
			
			
			System.out.println("-1");
		
		
		
	}


}
