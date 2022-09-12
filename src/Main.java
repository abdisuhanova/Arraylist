import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Madina", 19));
        students.add(new Student("Cholpon", -19));
        students.add(new Student("Aibek", 20));
        students.add(new Student("Beksultan", 13));
        students.add((null));
        try{
            for (Student student: students){
                System.out.println(student.getName()
                        + "\nThe age of a student is " + student.getAge() + "\n");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Buttu!!!");
        }
    }
}