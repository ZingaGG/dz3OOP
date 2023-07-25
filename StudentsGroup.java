import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// � Модифицировать класс УчебнаяГруппа, заставив его реализовать
// интерфейс Iterable
// � Реализовать метод iterator() возвращающий экземпляр созданного нами
// итератора
// � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
// студента по ФИО
// � Создать класс Контроллер, добавив в него метод удаления студента и
// вызывать в нем созданный метод из УчебнаяГруппаСервис

public class StudentsGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentsGroup(){
        students = new ArrayList<>();
    }

    public StudentsGroup(List<Student> students){
        setStudents(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        if(student != null){
            students.add(student);
        }
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Student student : students) {
            sb.append(student).append("\n");
        }

        return sb.toString();
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }

    
}
