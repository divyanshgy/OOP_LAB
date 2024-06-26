class bike{
    int speedlimit=60;
    void run(){
        System.out.println("Bike's speed should not go above speed limit");
    }
}
class splendar extends bike{
    int speedlimit=50;
    void run(){
        System.out.println("Splendar's speed should not go above speed limit");
    }
}
public class Lab6q5 {
    public static void main(String[] args) {
        bike b=new bike();
        bike b1=new splendar();
        b.run();
        System.out.println("Speed limit of bike: "+b.speedlimit);
        b1.run();
        System.out.println("Speed limit of splendar: "+b1.speedlimit);
    }
}
