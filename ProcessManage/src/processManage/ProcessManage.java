package processManage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessManage {

	public ProcessManage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]) throws IOException{
		byte[] buffer=new byte[512];
		while(true){
		System.out.print("����������Ҫִ�еĳ�����ļ�·��: ");//D:\\����������\\CloudMusic\\cloudmusic.exe
		int s=System.in.read(buffer);//D:\\QQ����\\QQMusic1257.15.13.33\\QQMusic.exe
		byte[] buffer1 = new byte[512];
		for(int i = 0;i < 512;i++){
			buffer1[i] = buffer[i];
		}
		String p_idString = new String(buffer1);
		buffer[s-2] = '\0'; 
		buffer[s-1] = '\0';
		String cmd = new String(buffer);
		new ProcessManageThread(cmd).start();
		}
	}
}
