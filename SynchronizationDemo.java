class Table{
public synchronized void printTable(int num) {
for (int i = 1; i <= 10; i++) {
System.out.println(num+" * "+i+" = "+(num*i));
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
class MyThread1 extends Thread{
Table t;
MyThread1(Table t){
this.t = t;
}
public void run() {
t.printTable(10);
}
}
class MyThread2 extends Thread{
Table t;
MyThread2(Table t){
this.t = t;
}
public void run() {
	t.printTable(100);
}
}
public class SynchronizationDemo {
public static void main(String[] args) {
Table t = new Table();
MyThread1 t1 = new MyThread1(t);
MyThread2 t2 = new MyThread2(t);
t1.start();
t2.start();
}
}