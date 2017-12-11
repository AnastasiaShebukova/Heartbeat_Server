package src.org.htw.fiw.vs;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class HeartBeatServer implements HeartBeatObserverInterface {
	public static void main(String[] args) {
		try {
			HeartBeat hb = (HeartBeat) Naming.lookup("//localhost/HeartBeat");
			HeartBeatSubjectInterface hbsubject = (HeartBeatSubjectInterface) Naming.lookup("//localhost/HeartBeatSubj");
			//SpotifyService ss = (SpotifyService) Naming.lookup("//localhost/SpotifyService");
			//System.out.println(ss.adaptVolume(hb.getHeartBeat()));
			HeartBeatServer hbserver = new HeartBeatServer();
			hbsubject.subscribeObject(hbserver);
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void update(Object observable, int heartbeat) throws RemoteException {
		System.out.println("got heartrate:" + heartbeat);
	}
}

