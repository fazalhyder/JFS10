class RedSignalThread extends Thread{
	public void run(){
		for (int i = 1; i <= 5; i++) {
	System.out.println(" Red signal thread ");
     try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
		}
	}
}
class YellowSignalThread extends Thread{
	public void run(){
		for (int i = 1; i <= 5; i++) {
	System.out.println(" Yellow signal thread ");
	try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
		}
	}
}
class GreeenSignalThread extends Thread{
	public void run(){
		for (int i = 1; i <= 5; i++) {
	System.out.println(" Green signal thread ");
	try {
          Thread.sleep(1000);
        } catch (InterruptedException e) 
		  {
           e.printStackTrace();
           }
		}
	}
}
public class signals {
	public static void main (String [] args){
		try{
		RedSignalThread r = new RedSignalThread();
		r.start();
		r.join();
	    YellowSignalThread y = new YellowSignalThread();
		y.start();
		y.join();
		GreeenSignalThread g = new GreeenSignalThread();
		g.start();}
		catch (InterruptedException e) 
		  {
           e.printStackTrace();
           }

	}
}
		