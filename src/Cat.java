public class Cat implements Animal{
    String n;
    int x;
    public Cat(String n , int x){
        this.n=n;
        this.x=x;
    }
    public String toString (){
        return "{"+n+","+x+",Cat}";
    }
    @Override
    public void doSound(){
        System.out.println("Meow");
    }

}
