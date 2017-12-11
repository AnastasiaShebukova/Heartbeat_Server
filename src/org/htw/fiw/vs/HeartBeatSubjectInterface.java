package src.org.htw.fiw.vs;



public interface HeartBeatSubjectInterface extends java.rmi.Remote {
	
	public void subscribeObject(Object object)
			throws java.rmi.RemoteException;
	
	public void removeObject(Object object)
			throws java.rmi.RemoteException;
	
	public void notifyObservers()
			throws java.rmi.RemoteException;
	
}
