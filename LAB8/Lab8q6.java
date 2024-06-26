interface sports{
    int getNumberOfGoals();
    void dispTeam();
}
class Hockey implements sports{
    int g;
    String t1one;
    String t1two;
    String t1three;
    String t2one;
    String t2two;
    String t2three;
    Hockey(int g,String t1one,String t1two,String t1three,String t2one,String t2two,String t2three){
        this.g=g;
        this.t1one=t1one;
        this.t1two=t1two;
        this.t1three=t1three;
        this.t2one=t2one;
        this.t2two=t2two;
        this.t2three=t2three;
    }
    public int getNumberOfGoals(){
        return g;
    }
    public void dispTeam(){
        System.out.println("Hockey Team 1: ");
        System.out.println(t1one+" "+t1two+" "+t1three);
        System.out.println("Hockey Team 2: ");
        System.out.println(t2one+" "+t2two+" "+t2three);
    }
}
class Football implements sports{
    int g;
    String t1one;
    String t1two;
    String t1three;
    String t2one;
    String t2two;
    String t2three;
    Football(int g,String t1one,String t1two,String t1three,String t2one,String t2two,String t2three){
        this.g=g;
        this.t1one=t1one;
        this.t1two=t1two;
        this.t1three=t1three;
        this.t2one=t2one;
        this.t2two=t2two;
        this.t2three=t2three;
    }
    public int getNumberOfGoals(){
        return g;
    }
    public void dispTeam(){
        System.out.println("Football Team 1: ");
        System.out.println(t1one+" "+t1two+" "+t1three);
        System.out.println("Football Team 2: ");
        System.out.println(t2one+" "+t2two+" "+t2three);
    }
}

public class Lab8q6 {
    public static void main(String[] args) {
        Hockey h=new Hockey(2, "akshat", "patel", "jim", "arjun", "karan", "prerit");
        Football f=new Football(3, "gomez", "messi", "lopez", "ronaldo", "elijah", "niklaus");
        h.dispTeam();
        System.out.println("Goals in hockey: "+h.getNumberOfGoals());
        f.dispTeam();
        System.out.println("Goals in football: "+f.getNumberOfGoals());

    }
}
