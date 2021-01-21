package assignment03;

public class RosterTester {

    public static void main(String[] args) {
        Roster classList = new Roster();
        Person p0 = new Person("Boil", "Larry", 1992, 12, 4);
        Person p1 = new Person("Reeves", "Keanu", 1964, 9, 2);
        Person p2 = new Person("Win", "Tristan", 2002, 3, 9);
        Person r0 = new Person("REMOVE", "REMOVE", 2000, 1, 1);
        Person p3 = new Person("Walsh", "Jeremy", 1999, 5, 21);
        Student s0 = new Student(p0, "Mechanical Engineering", 3.80, "B004444");
        Student s1 = new Student(p1, "Theater", 3.6, "B002222");
        Student s2 = new Student(p2, "Chemistry",  3.2, "B009999");
        Student r1 = new Student(r0, "Beer Pong", 1.6, "B000000");
        Student s3 = new Student(p3, "Computer Science", 4.0, "B001111");
        classList.addStudent(s0);
        classList.addStudent(s1);
        classList.addStudent(s2);
        classList.addStudent(r1);
        classList.addStudent(s3);
        System.out.println(classList.toString());
        System.out.println("====Drop====");
        classList.dropStudent("B000000");
        System.out.println(classList.toString());
        System.out.println("====Drop1====");
        classList.addStudent(r1);
        classList.dropStudent1("B000000");
        System.out.println(classList.toString());
        System.out.println("====Drop2====");
        classList.addStudent(r1);
        classList.dropStudent2("B000000");
        System.out.println(classList.toString());
        System.out.println("====Sort====");
        classList.sortByBNum();
        System.out.println(classList.toString());

    }
}
