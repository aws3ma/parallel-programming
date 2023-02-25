public class Test {
    public static void main(String[] args) throws InterruptedException {
        MonThread t= new MonThread("hello",1000);
        MonThread t2= new MonThread("from the other siiide",2000);
        t.start();
        t2.start();
        try {
            t.join();
            t2.join();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin");
    }
}
