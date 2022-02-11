class threadOne implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable is running!!!");
    }
}
class hi{
    public void showMethod(){
        for(int j=0; j<5; j++) {
            System.out.println(j+") Hi!!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception is: " + e.getMessage());
            }
        }
    }
}

class howAre extends hi implements Runnable{
    public void run(){
        System.out.println("howAre you implements the Runnable!!");
    }
    public void RunTwo(){
        try {
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println("");
        }
    }
}

class hello extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i+ ") Hello!!");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("Exception is: "+e.getMessage());
            }
        }
    }
}

public class multiMain {
    public static void main(String[] args){
        hello objOne = new hello();
        objOne.start();

        System.out.println();
        hi objTwo = new hi();
        objTwo.showMethod();
        System.out.println();
        Runnable objT = new threadOne();
        objT.run();
        System.out.println("join..........");
        try {
            objOne.join(500);
        }catch (Exception e){
            System.out.println("Exception is: " + e.getMessage());
        }
    }
}
