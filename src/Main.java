import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Tom",32);
        Animal mouse1 = new Mouse("Jerry",5);
        //System.out.println(cat1);
        //System.out.println(mouse1);
        cat1.doSound();
        mouse1.doSound();
        List<Animal> animals = Arrays.asList(new Mouse("Jerry",5), new Cat("Tom",32));
        for (Animal animal:animals) {
            System.out.println(animal);
        }
    }
}
