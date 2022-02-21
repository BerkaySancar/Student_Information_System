public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double quizNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quizNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("The teacher and the lesson are incompatible !");
        }
    } void printTeacher(){
        if (teacher != null)
            System.out.println("Course: "+ this.name + "\nTeacher: " + teacher.name);
        else
            System.out.println("No Teacher Available !");
        }
    }

