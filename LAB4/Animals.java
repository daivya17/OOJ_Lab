import java.util.Scanner;

abstract class Animal {
    String food;
    int sleepHours;
    public Animal(String food, int sleepHours) {
        this.food = food;
        this.sleepHours = sleepHours;
    }
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal {
    public Lion(String food, int sleepHours) {
        super(food, sleepHours);
    }

    @Override
    public void eat() {
        System.out.println("The lion eats: " + food);
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleeps for: " + sleepHours + " hours.");
    }
}
class Tiger extends Animal {
    public Tiger(String food, int sleepHours) {
        super(food, sleepHours);
    }
    @Override
    public void eat() {
        System.out.println("The tiger eats: " + food);
    }
    @Override
    public void sleep() {
        System.out.println("The tiger sleeps for: " + sleepHours + " hours.");
    }
}
class Deer extends Animal {
    public Deer(String food, int sleepHours) {
        super(food, sleepHours);
    }
    @Override
    public void eat() {
        System.out.println("The deer eats: " + food);
    }
    @Override
    public void sleep() {
        System.out.println("The deer sleeps for: " + sleepHours + " hours.");
    }
}
public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter food for Lion: ");
        String lionFood = scanner.nextLine();
        System.out.print("Enter sleep hours for Lion: ");
        int lionSleepHours = scanner.nextInt();
        Animal lion = new Lion(lionFood, lionSleepHours);
        scanner.nextLine();
        System.out.print("Enter food for Tiger: ");
        String tigerFood = scanner.nextLine();
        System.out.print("Enter sleep hours for Tiger: ");
        int tigerSleepHours = scanner.nextInt();
        Animal tiger = new Tiger(tigerFood, tigerSleepHours);
        scanner.nextLine();
        System.out.print("Enter food for Deer: ");
        String deerFood = scanner.nextLine();
        System.out.print("Enter sleep hours for Deer: ");
        int deerSleepHours = scanner.nextInt();
        Animal deer = new Deer(deerFood, deerSleepHours);
        lion.eat();
        lion.sleep();
       
        tiger.eat();
        tiger.sleep();
       
        deer.eat();
        deer.sleep();
    }
}
