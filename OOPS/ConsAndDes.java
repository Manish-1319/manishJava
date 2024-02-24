public class ConsAndDes {
    public static void main(String[] args) {
        Pen p1 = new Pen();    //Default constructor is called
        System.out.println(p1.color);

        Student s1 = new Student();

        Student s2 = new Student(33);
        System.out.println(s2.rollNo);

        Student s3 = new Student();
        s3.name = "Manish";
        s3.rollNo = 33;
        s3.password = "abcd";
        s3.marks[0] = 100;
        s3.marks[1] = 90;
        s3.marks[2] = 80;

        Student s4 = new Student(s3);
        s4.password = "xyz";
        s3.marks[2] = 70;
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
    }
}

class Pen {
    String color = "Blue";
}

class Student {
    String name;
    int rollNo;
    String password;
    int[] marks;
    
    // Non-parameterized Constructor
    Student() { 
        marks = new int[3];   
        System.out.println("constructor is called...");
    } 

    // Parameterized Constructor
    Student(String name) {   
        marks = new int[3];   
        this.name = name;
    }
    Student(int roll) {
        marks = new int[3];  
        this.rollNo = roll;
    }

    // Shallow Copy constructor(Changes reflect)
    // Student(Student s3) {
    //     marks = new int[3];  
    //     this.name = s3.name;
    //     this.rollNo = s3.rollNo;
    //     this.marks = s3.marks;
    // }

    //Deep copy constructor(Changes don't reflect)
    Student(Student s3){
        marks = new int[3];  
        this.name = s3.name;
        this.rollNo = s3.rollNo; 
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s3.marks[i];
        }
    }
}
