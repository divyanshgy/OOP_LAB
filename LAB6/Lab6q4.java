class game{
    void type(){
        System.out.println("Indoor and outdoor games");
    }
}
class cricket extends game{
    void type(){
        System.out.println("cricket is an outdoor game");
    }
}
class chess extends game{
    void type(){
        System.out.println("chess is an indoor game");
    }
}

public class Lab6q4 {
    public static void main(String[] args) {
        game g=new game();
        game g1=new cricket();
        game g2=new chess();
        g.type();
        g1.type();
        g2.type();
    }
}
