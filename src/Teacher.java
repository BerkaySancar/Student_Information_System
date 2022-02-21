public class Teacher {

    String name;
    String phoneNum;
    String branch;

    Teacher (String name, String branch, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
        this.branch = branch;
    }
    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Phone Number: " + this.phoneNum);
    }
}
