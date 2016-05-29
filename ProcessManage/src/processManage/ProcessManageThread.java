package processManage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessManageThread extends Thread{
	private String cmdString;
	public ProcessManageThread() {
		// TODO Auto-generated constructor stub
	}
	public ProcessManageThread(String cmd){
		this.cmdString = cmd;
	}
	public void run(){
		try {
			 Runtime rt = Runtime.getRuntime();  
	         Process pr = rt.exec(cmdString); 
	         
	         InputStream stderr = pr.getErrorStream();
	         InputStreamReader isr = new InputStreamReader(stderr);
	         BufferedReader br = new BufferedReader(isr);
	         String line = null;
	         while ( (line = br.readLine()) != null){
	        	 
	         }
	         
	         int exitVal = pr.waitFor();
	         
	         if(exitVal == 0){
	        	 System.out.println("\n程序正常终止！ :" + cmdString);
	         }
	         else{
	        	 System.out.println("\n程序非正常终止！ :" + cmdString);
	         }
		} catch (Exception e) {
			// TODO: handle exception
			  System.out.println(e.toString());  
	            e.printStackTrace();  
		}
	}
}

