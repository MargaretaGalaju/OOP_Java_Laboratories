package OOP.lab1.part_2;

class Main {
    public static void main(String[] args) {

        Student[] studentsUTM = {
                new Student("Johny Doe", 20,9.8f),
                new Student("Jack Sparrow", 22, 8.52f),
                new Student("Marla Singer", 18, 7f)
        };

        Student[] studentsUSM = {
                new Student("Carrie White", 19,9.9f),
                new Student("Natalie Portman", 22, 8f),
                new Student("Tony Stark", 18, 10f)
        };

        Student[] studentsHogwarts = {
                new Student("Olga Buzova", 30,10f),
                new Student("Donald Trump", 65, 10f),
                new Student("Maia Sandu", 45, 10f)
        };



        System.out.println(studentsUTM[0]);
        System.out.println(studentsUTM[1]);
        System.out.println(studentsUTM[2]);
        System.out.println(" ");

        University univer1 = new University("UTM", 1964, studentsUTM);
        University univer2 = new University("USM", 1946, studentsUSM);
        University univer3 = new University("Hogwarts", 900, studentsHogwarts);

        System.out.println(univer1);
        System.out.println(univer2);
        System.out.println(univer3);

       float finalMark;
       finalMark = (univer1.averageMark + univer2.averageMark + univer3.averageMark) /3;
        System.out.println("The average mark between universities is: " + finalMark);
    }

}
