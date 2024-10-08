import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;
    private int n;

    void getdetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        n = s.nextInt();
        credits = new int[n];
        marks = new int[n];
        s.nextLine();

        System.out.print("Enter your USN: ");
        usn = s.nextLine();
        System.out.print("Enter your name: ");
        name = s.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits:");
            credits[i] = s.nextInt();
            System.out.print("Enter marks obtained:");
            marks[i] = s.nextInt();
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks Obtained: " + marks[i]);
        }
    }

    private int getGP(int marks) {
        if (marks >= 90) return 10;
        if (marks >= 80) return 9;
        if (marks >= 70) return 8;
        if (marks >= 60) return 7;
        if (marks >= 50) return 6;
        if (marks >= 40) return 5;
        return 0;
    }

    double getsgpa() {
        int totalCredits = 0;
        double totalGP = 0.0;
        for (int i = 0; i < n; i++) {
            int subGP = getGP(marks[i]);
            totalGP += subGP * credits[i];
            totalCredits += credits[i];
        }
        return totalGP / totalCredits;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.println("enter no of students:");
	int num=s.nextInt();
	for(int i=0;i<num;i++){
		System.out.println("Student "+(i+1)+" :");
		Student s1=new Student();
		s1.getdetails();
		s1.display();
		double res=s1.getsgpa();
		System.out.println("SGPA:"+res);
}
    }
}

