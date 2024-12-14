class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    protected int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.age = age;
    }
}

class Son extends Father {
    public int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
    }
}

public class Familytree {
    public static void main(String[] args) {
        try {
            int fatherAge1 = 40;
            int sonAge1 = 15;
            Son son1 = new Son(fatherAge1, sonAge1);
            System.out.println("Father's age: " + son1.age);
            System.out.println("Son's age: " + son1.sonAge);

            int fatherAge2 = 50;
            int sonAge2 = 60;
            Son son2 = new Son(fatherAge2, sonAge2);
            System.out.println("Father's age: " + son2.age);
            System.out.println("Son's age: " + son2.sonAge);

        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
