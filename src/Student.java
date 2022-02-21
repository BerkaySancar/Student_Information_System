public class Student {
    Course software;
    Course test;
    Course algorithm;
    String name;
    String stuNum;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNum, String classes, Course software, Course test, Course algorithm) {
        this.name = name;
        this.stuNum = stuNum;
        this.classes = classes;
        this.software = software;
        this.test = test;
        this.algorithm = algorithm;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int quiz1, int note2, int quiz2, int note3, int quiz3) {
        if (note1 >= 0 && note1 <= 100)
            this.software.note = note1;
        if (quiz1 >= 0 && quiz1 <= 100)
            this.software.quizNote = quiz1;
        if (note2 >= 0 && note2 <= 100)
            this.test.note = note2;
        if (quiz2 >= 0 && quiz2 <= 100)
            this.test.quizNote = quiz2;
        if (note3 >= 0 && note3 <= 100)
            this.algorithm.note = note3;
        if (quiz3 >= 0 && note3 <= 100)
            this.algorithm.quizNote = quiz3;
    }

    double calculateAverage() {
        double softwareCalcNote = ((this.software.note * 0.80) + (this.software.quizNote * 0.20));
        double testCalcNote = ((this.test.note * 0.65) + (this.test.quizNote * 0.35));
        double mathCalcNote = ((this.algorithm.note * 0.50) + (this.algorithm.quizNote * 0.50));
        this.average = (softwareCalcNote + testCalcNote + mathCalcNote) / 3.0;
        return this.average;
    }

    void isPass() {
        System.out.println("");
        if (calculateAverage() >= 50) {
            System.out.println("Student Name: " + this.name);
            System.out.println("Status : Congratulations, You passed ! ");
            this.isPass = true;
        } else {
            System.out.println("Student Name: " + this.name);
            System.out.println("Status : You failed the class !");
            this.isPass = false;
        }

        printNote();
    }

    void printNote() {

        System.out.println(this.software.name + " Exam: " + this.software.note);
        System.out.println(this.software.name + " Quiz: " + this.software.quizNote);
        System.out.println(this.test.name + " Exam: " + this.test.note);
        System.out.println(this.test.name + " Quiz: " + this.test.quizNote);
        System.out.println(this.algorithm.name + " Exam: " + this.algorithm.note);
        System.out.println(this.algorithm.name + " Quiz: " + this.algorithm.quizNote);
        System.out.println("Average = " + this.average);
    }
}
