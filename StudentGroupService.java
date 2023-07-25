// � Модифицировать класс УчебнаяГруппа, заставив его реализовать
// интерфейс Iterable
// � Реализовать метод iterator() возвращающий экземпляр созданного нами
// итератора
// � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
// студента по ФИО
// � Создать класс Контроллер, добавив в него метод удаления студента и
// вызывать в нем созданный метод из УчебнаяГруппаСервис

import java.util.List;

public class StudentGroupService {
    private StudentsGroup studentsGroup;

    public StudentGroupService(StudentsGroup studentsGroup){
        this.studentsGroup = studentsGroup;
    }

    public StudentGroupService(){
        this.studentsGroup = new StudentsGroup();
    }


    public boolean removeStudent(String firstName, String secondName, String lastName){
        
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        if (studentsGroup.getStudents() == null){
            return false;
        }

        List<Student> studentsList = studentsGroup.getStudents();
        for (Student student : studentsList) {
            if(student.equals(removeStudent)){
                studentsList.remove(student);
                return true;
            }
        }
        return false;
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
