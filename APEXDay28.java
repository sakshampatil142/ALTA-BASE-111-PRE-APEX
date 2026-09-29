import java.util.Scanner;

class Student {
    String name;
    int age;
    int marks;
}

public class APEXDay28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.name = sc.next();      // read name first
        s.age = sc.nextInt();    // then age
        s.marks = sc.nextInt();  // then marks

        System.out.println(s.name + ", " + s.age + ", " + s.marks);
        sc.close();
    }
}