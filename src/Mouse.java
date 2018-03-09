public class Mouse implements Animal {
    String n;
    int x;
    public Mouse(String n, int x ){
        this.n=n;
        this.x = x;
    }

    public String toString(){

        return "{"+n+","+x+",Mouse}";


    }
    public void doSound(){
        System.out.println("RIPI");
    }
}
