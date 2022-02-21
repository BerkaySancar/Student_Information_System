public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Arda", "SFT", "123");
        Teacher t2 = new Teacher("Onur", "TST", "111");
        Teacher t3 = new Teacher("Bekir", "ALG", "000");

        Course software = new Course("Software", "101", "SFT");
        software.addTeacher(t1);

        Course test = new Course("Test", "102", "TST");
        test.addTeacher(t2);

        Course algorithm = new Course("Algorithm", "103", "ALG");
        algorithm.addTeacher(t3);

        Student s1 = new Student("Berkay", "1", "1", software, test, algorithm);
        s1.addBulkExamNote(60,60,70,70,50,50);
        s1.isPass();

        Student s2 = new Student("Burcu", "2", "1", software, test, algorithm);
        s2.addBulkExamNote(20,50,70,60,90,45);
        s2.isPass();

        Student s3 = new Student("Ateş","3","1", software, test, algorithm);
        s3.addBulkExamNote(20,10,50,30,40,40);
        s3.isPass();

    }
}
