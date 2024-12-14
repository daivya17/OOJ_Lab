import java.util.Scanner;
class Mystud{
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;
    public void getdetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter usn:");
        usn = s.nextLine();
        System.out.println("enter name:");
        name = s.nextLine();
        System.out.println("enter no of subjects:");
        n = s.nextInt();
        credits = new int[n];
        marks = new int[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter credits:");
            credits[i] = s.nextInt();
            System.out.println("enter marks obtained:");
            marks[i] = s.nextInt();
        }
    }
    public void showdetails(){
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        for(int i=0;i<n;i++){
            System.out.println("Credits:"+credits[i]);
            System.out.println("Marks:"+marks[i]);
        }
    }
    int getgp(int marks){
        if(marks>=90){
            return 10;
        }
        else if(marks>=80 && marks<90){
            return 9;
        }
        else if(marks>=70 && marks<80){
            return 8;
        }
        else if(marks>=60 && marks<70){
            return 7;
        }
        else if(marks>=50 && marks<60){
            return 6;
        }
        else if(marks>=40 && marks<50){
            return 5;
        }
        else{
            return 0;
        }
    }
    public void calcgp(){
        int tc = 0;
        for(int i=0;i<n;i++){
            tc+=credits[i];
        }
        int totalgp = 0;
        for(int i=0;i<n;i++){
            int gp = getgp(marks[i]);
            totalgp += (credits[i]*gp);
        }
        double cgpa = (double) totalgp /tc;
        System.out.println("CGPA:"+cgpa);
    }
}
public class Calccgpa {
    public static void main(String[] args){
        Mystud m = new Mystud();
        m.getdetails();
        m.showdetails();
        m.calcgp();
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
