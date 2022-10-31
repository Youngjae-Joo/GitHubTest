package java_1031.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		//자기 컴퓽터에 전송할 때는 127.0.0.1.입니다.
		try(Scanner scan = new Scanner(System.in)){
			
			while(true) {
				Socket socket = new Socket(InetAddress.getByName("172.30.1.2"),9999);
				System.out.print("보낼 메시지:");
				String message = scan.nextLine();
				
				//메시지 보내기
				PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
				pw.println(message);
				pw.flush();
				
				//메시지 받기
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				
				
				socket.close();
				br.close();
				pw.close();
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}
}
