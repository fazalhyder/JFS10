class Thread1 extends Thread{
int total = 0;
public void run()
{
synchronized(this){
System.out.println("Child thread starts calculations");//(2)
for(int a=1; a<=100; a++){
total = total+a;
System.out.println("Child thread starts calculations "+a);
}
System.out.println("Child thread gives notification call");//(3)
this.notify();
}
}
}
class STest {
public static void main(String[] args)throws InterruptedException {
Thread1 t1 = new Thread1();
t1.start();
synchronized(t1){
System.out.println("Main thread calling wait() method");//(1)
t1.wait();
System.out.println("Main thread got notification from child thread");//(4)
System.out.println(t1.total);//(5)
}
}
}