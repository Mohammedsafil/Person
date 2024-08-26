package Teacher;

public class main {
    public static void main(String[] args){
        Person p = new Student("Kishor", 18, 'O');
        p.displayDetails();

        p = new Teacher("Giridharan", 45, "Oops in java");
        p.displayDetails();
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    private char grade;

    public Student(String name, int age, char grade){
        super(name,age);
        this.grade = grade;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Grade: "+ grade);
    }
}

class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age,String subject){
        super(name,age);
        this.subject = subject;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject: "+ subject);
    }
}