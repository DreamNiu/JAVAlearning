package TestNetwork;

import java.io.*;
import java.net.*;

public class TCPServer {
	private static ServerSocket welcomeSocket;

	public static void main(String[] args) throws Exception{
		String clientSentence;
		String capitalizeSentence;
		welcomeSocket = new ServerSocket(6789);
		while(true){
			Socket connectionSocket=welcomeSocket.accept();
			BufferedReader inFromClient=new BufferedReader(
					new InputStreamReader(
							connectionSocket.getInputStream()));
			DataOutputStream outToClient=new DataOutputStream(
					connectionSocket.getOutputStream());
			clientSentence = inFromClient.readLine();
			capitalizeSentence=clientSentence.toUpperCase()+'\n';
			outToClient.writeBytes(capitalizeSentence);
		}
	}
}
