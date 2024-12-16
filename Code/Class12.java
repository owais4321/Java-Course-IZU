// class BankAccount{
//     private String accno = "AKB1234566009";

//     public String getAccno(){
//         return this.accno;
//     }

//     public void setAccno(String accno){
//         this.accno = accno;
//     }
// }

// Create a Student class with private fields name and grade.
// Provide public getter and setter methods for these fields.
// Ensure that grade cannot be set to a negative value.

// class Student{
//     private String name;
//     private double grade;

//     public void setName(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return this.name;
//     }

//     public double getGrade(){
//         return this.grade;
//     }

//     public void setGrade(double grade){
//         if (grade>0) this.grade  = grade;
//         else this.grade  = -1;

//     }

// }

abstract class Shape{
    private String name;

    abstract public void draw();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }


}

class Class12{
    public static void main(String[] args) {
        // BankAccount b1 = new BankAccount();
        // System.out.println(b1.getAccno());
        // b1.setAccno("Hello new account number");
        // System.out.println(b1.getAccno());
        Student s1 = new Student();
        s1.setName("name");
        s1.setGrade(-89);
        System.out.println(s1.getName());
        if (s1.getGrade()!=-1) System.out.println(s1.getGrade());
        else System.out.println("Invalid Grade");
    }
}

1/sqrt()