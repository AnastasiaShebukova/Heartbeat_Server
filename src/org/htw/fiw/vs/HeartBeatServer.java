package src.org.htw.fiw.vs;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class HeartBeatServer implements HeartBeatObserverInterface {
	public static void main(String[] args) {
		try {
			HeartBeatSubjectInterface hbsubject = (HeartBeatSubjectInterface) Naming.lookup("//localhost/HeartBeat");
			HeartBeatServer hbserver = new HeartBeatServer();
			hbsubject.subscribeObject(hbserver);
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void update(Object observable, int heartbeat) throws RemoteException {
		System.out.println("got heartrate:" + heartbeat);
		//hier vielleicht dann lookup nach dem spotify service und entsprechende aktionen dort? würde dann aber bei jedem update eben neu
		//aufgerufen werden.. bzw. gesucht. Oder das auch mit Observer pattern, dass wir dann hier das subject sind? 
	}
}

