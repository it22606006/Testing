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



public class App {
    public static void main(String[] args) throws Exception {
        Display obj = new Display();
        T t1 = new T(obj);
        t1.start();
    }
}
