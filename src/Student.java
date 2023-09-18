public class Student {
    String id;
     String name;
     String surname;
     int course;
     int age;


    public Student(String id1, String name1, String surname1, int course1, int age1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        age = age1;

    }

    public Student(String id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0);
    }

    public Student() {

    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student("123", "Валерия", "Боброва", 1, 23);
        Student student2 = new Student("456", "Сергей", "Рыбин", 2);
        Student student3 = new Student();
        System.out.println("Id: " + student1.id + "\n" + "Имя: " + student1.name + ", Фамилия: " + student1.surname +
                "\n" + "Курс: " + student1.course + "\n" + "Возраст: " + student1.age);
        System.out.println();
        System.out.println("Id: " + student2.id + "\n" + "Имя: " + student2.name + ", Фамилия: " + student2.surname +
                "\n" + "Курс: " + student2.course);
        System.out.println();
        System.out.println("Id: " + student3.id + "\n" + "Имя: " + student3.name + ", Фамилия: " + student3.surname +
                "\n" + "Курс: " + student3.course + "\n" + "Возраст: " + student3.age);
    }
}