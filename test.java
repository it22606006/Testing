class Display{
    void print(){
        for(int i=0; i<10; i++){
            try{
                System.out.println("Hello");
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

class T extends Thread{
    Display c;

    T(Display c){
        this.c = c;
    }

    public void run(){
        c.print();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Display obj = new Display();
        T t1 = new T(obj);
        t1.start();
    }
}
