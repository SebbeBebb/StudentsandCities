public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(20000, "Sebastian");
        Student student2 = new Student(19970, "Axel");
        Student student3 = new Student(13000, "Loke");
        Student student4 = new Student(13100, "Tobias");

        City hometown1 = new City("Stockholm", "Sweden");
        City hometown2 = new City("Axel&LokesSwamp", "NotSweden");

        student1.setHometown(hometown1);
        student2.setHometown(hometown2);
        student3.setHometown(hometown2);
        student4.setHometown(hometown1);

        student1.setBuddy(student2);

    }
}