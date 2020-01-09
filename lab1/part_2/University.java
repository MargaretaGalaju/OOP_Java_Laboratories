package OOP.lab1.part_2;

public class University {
    String name;
    int foundationYear;
    Student[] students;
    float averageMark;


    public University(String name, int foundationYear, Student[] students){
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
        this.averageMark = computingAvg();
    }

    public float computingAvg(){

        float sum = 0;
        float finalM = 0;
        for(int i = 0; i < this.students.length; i++)
        {
            sum += students[i].mark;
            this.averageMark = sum / this.students.length;
        }
       return this.averageMark = sum / this.students.length;
  }

    @Override
    public String toString() {
        String result = name + " is founded in "+ foundationYear + " and has the following students: ";
        for (int i = 0; i < students.length; i++) {

            result += students[i].studentName + "; ";

        }
        return result + " The average mark of the students in this university is " + averageMark + ". " ;
    }
}
