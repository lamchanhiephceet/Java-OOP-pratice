public class Main {
    public static void main(String args[]) {
        Students students = new Students();
        System.out.println("Student name:" + students.name);
        System.out.println("Student address:" + students.address);
        System.out.println("Student age:" + students.age);
        System.out.println("Student id:" + students.getId());
        System.out.println("Student math:" + students.math);
        System.out.println("Student physical:" + students.physical);
        System.out.println("Student chemistry:" + students.chemistry);
        System.out.println("Student GPA:" + students.GPA());
    }

}
