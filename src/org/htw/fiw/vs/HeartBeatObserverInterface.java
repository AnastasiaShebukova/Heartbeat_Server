package src.org.htw.fiw.vs;


public interface HeartBeatObserverInterface extends java.rmi.Remote  {
	
	public void update(Object observable, int heartbeat) //hier kann irgendwie auch gleich setHeartBeatState() eingesetzt werden oder ähnliche. Das habe ich nicht richtig verstanden. 
			throws java.rmi.RemoteException;
 //update();
}
