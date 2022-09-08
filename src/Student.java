public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        if (age >= 0){this.age = age;}
        else{throwingExceptionIfNegative(age);}
    }
    public int getAge(){return age;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public void setAge(int age) {
        if (age >= 0){this.age = age;}
        else{throwingExceptionIfNegative(age);}
    }
    public void throwingExceptionIfNegative(int number) {
        throw new Exception(number + " isn't positive!");
    }
}
