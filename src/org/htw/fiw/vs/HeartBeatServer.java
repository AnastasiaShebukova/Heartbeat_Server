package src.org.htw.fiw.vs;

import java.rmi.Naming;

public class HeartBeatServer {
	public static void main(String[] args) {
		try {
			HeartBeat hb = (HeartBeat) Naming.lookup("//localhost/HeartBeatService");
			SpotifyService ss = (SpotifyService) Naming.lookup("//localhost/SpotifyService");
			System.out.println(ss.adaptVolume(hb.getHeartBeat()));
		} catch (Exception e){
			System.out.println(e);
		}
	}
}

