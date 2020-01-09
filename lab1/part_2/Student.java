package OOP.lab1.part_2;

public class Student {
    String studentName;
    int age;
    float mark;

    public Student(String name, int age, float mark){
        this.studentName = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
public String toString() {
    return "The student " + studentName + " is "+ age + " years old. His mark is:  " + mark ;
}
}
