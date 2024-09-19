package br.ueg.posse.si.p4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraServiceImpl extends UnicastRemoteObject implements CalculadoraService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected CalculadoraServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public double adicionar(double x, double y) throws RemoteException{
		return x + y;
	}

	@Override
	public double subtrair(double x, double y) throws RemoteException{
		return x - y;
	}

	@Override
	public double dividir(double x, double y) throws RemoteException{
		return  x / y;
	}

	@Override
	public double multiplicar(double x, double y) throws RemoteException{
		return x * y;
	}

}
