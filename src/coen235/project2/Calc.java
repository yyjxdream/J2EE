package coen235.project2;
import java.rmi.*;
public interface Calc extends java.rmi.Remote {
public int calculate (String opcode, int op1, int op2) throws
RemoteException;
public int exit() throws RemoteException;
}

