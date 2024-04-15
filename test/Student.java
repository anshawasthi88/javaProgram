package test;

public class Student{
    int marks;
    int rollno;
    String name;


    public Student(int marks, int rollno , String name){
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    public Student(int marks,String name){
        this.name = name;
        this.marks = marks;
    }

    Student (Student other ){
        this.marks = other.marks;
        this.rollno = other.rollno;
        this.name = other.name;
    }
    public static  void main(String[] args) {
//        Student ansh = new Student(91,21,"awasthi");
////        System.out.println(ansh.name);
//        Student s1 = new Student(80,"tappu");
////        System.out.println(s1.name + " " + s1.marks);
//        Student s2 = new Student(ansh);
//        System.out.println(s2.name);
//        s2.name = "rishi";
//        System.out.println(ansh.name);

        Student ansh = new Student(91,21,"awasthi");
        Student s2 = ansh;
        s2.name = "rishi";
        System.out.println(ansh.name);
    }
}