package src.org.htw.fiw.vs;

public interface HeartBeat extends java.rmi.Remote {
	
	public int getHeartBeat()
			throws java.rmi.RemoteException;

}
