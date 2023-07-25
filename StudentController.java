// � Модифицировать класс УчебнаяГруппа, заставив его реализовать
// интерфейс Iterable
// � Реализовать метод iterator() возвращающий экземпляр созданного нами
// итератора
// � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
// студента по ФИО
// � Создать класс Контроллер, добавив в него метод удаления студента и
// вызывать в нем созданный метод из УчебнаяГруппаСервис
public class StudentController {
    
    private StudentGroupService studentGroupService = new StudentGroupService();

    public static void main(String[] args) {
        Student student1 = new Student(1, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(2, "Петров", "Иван", "Иванович");
        Student student3 = new Student(3, "Сидоров", "Иван", "Иванович");

        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);

        System.out.println(studentsGroup);
        System.out.println("-------------------------------");

        StudentGroupService studentGroupService = new StudentGroupService();
        studentGroupService.setStudentsGroup(studentsGroup);

        System.out.println(studentsGroup);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        studentGroupService.removeStudent("Иванов", "Иван", "Иванович");

        System.out.println(studentsGroup);

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }
}
