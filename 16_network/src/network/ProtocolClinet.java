package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClinet {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;
	
	
	public ProtocolClinet() {
		
			try {
				socket = new Socket("192.168.0.68", 9500);
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				keyboard = new BufferedReader(new InputStreamReader(System.in));
				
			} catch (UnknownHostException e) {
				System.out.println("서버를 찾을 수 없습니다");
				e.printStackTrace();
				System.exit(0);
			} catch (IOException e) {
				System.out.println("서버와 연결이 안되었습니다");
				e.printStackTrace();
				System.exit(0);
			}
			String msg;
			String line;
			while(true) {
				try {
					//서버로 보내는 쪽
					/*
					 * "100:angel"
					 * "200:angel"
					 * "300:angel:안녕"
					 */
					msg = keyboard.readLine();
					bw.write(msg+"\n"); // 엔터를 반드시 보내주어야한다. 서버에서 엔터가 없으면 읽지못함.
					bw.flush();//버퍼 비우기
					
					
					//서버로부터 받는 쪽
					/*
					 * angel님 입장
					 * angel님 퇴장
					 * [angel] 안녕
					 */
					line = br.readLine();
					System.out.println(line);
					
					String[] ar = msg.split(":");
					if(ar[0].equals("200")) {
						br.close();
						bw.close();
						socket.close();
						
						keyboard.close();
						
						System.exit(0);
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}//while
		
	}

	public static void main(String[] args) {
		new ProtocolClinet();
		
		

	}

}
