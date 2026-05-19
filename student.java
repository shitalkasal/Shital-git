public class student {
    String name;
    int age;
    String grade;

    public student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}