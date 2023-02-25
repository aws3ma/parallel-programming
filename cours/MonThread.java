public class MonThread extends Thread {
    private String msg;
    private int duree;
    public MonThread(String message,int d){
        msg=message;
        duree=d;
    }
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(msg);
            try {
                sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
