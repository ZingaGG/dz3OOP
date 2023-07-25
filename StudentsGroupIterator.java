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

public class StudentsGroupIterator implements Iterator<Student>{

    private List<Student> students;
    private int counter;

    public StudentsGroupIterator(StudentsGroup studentsGroup){
        this.students = studentsGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
       if(!hasNext()) return null;
        counter++;
        return students.get(counter);
    }

    @Override
    public void remove() {
        students = new ArrayList<>();
        counter = 0;
    }
    
    
}
