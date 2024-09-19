package br.ueg.posse.si.p4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraService extends Remote{
	
	double adicionar(double x, double y) throws RemoteException;
	double subtrair(double x, double y) throws RemoteException;
	double dividir(double x, double y) throws RemoteException;
	double multiplicar(double x, double y) throws RemoteException;

}
