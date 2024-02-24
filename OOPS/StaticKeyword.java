public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.collegeName = "MMMUT";

        Student s2 = new Student();
        System.out.println(s2.collegeName);
    }
}

class Student {
    String name;
    int roll;

    static String collegeName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}