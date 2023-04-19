package k;

public class lkj implements Runnable {
 String ime;
 Thread t;

 
 
 
public lkj(String ime, Thread t) {
	this.ime = ime;
	this.t = new Thread(this, ime);
	t.start();
}

public void run() {
	for(int i =1; i<=5; i++)
	Thread.sleep(5000);
	
}
 
	
	
	}


