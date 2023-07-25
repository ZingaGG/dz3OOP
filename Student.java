// � Модифицировать класс УчебнаяГруппа, заставив его реализовать
// интерфейс Iterable
// � Реализовать метод iterator() возвращающий экземпляр созданного нами
// итератора
// � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
// студента по ФИО
// � Создать класс Контроллер, добавив в него метод удаления студента и
// вызывать в нем созданный метод из УчебнаяГруппаСервис

public class Student implements Comparable<Student>{
    private Integer numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName){
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nNumber = " + numberOfStudent + "\n" +
        "First name = " + firstName + "\n" +
        "Second name = " + secondName + "\n" +
        "Last name = " + lastName + "\n";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
 
        Student student = (Student)o;

        return (this.firstName.equals((student.firstName)) &&
        this.secondName.equals(student.secondName) &&
        this.lastName.equals(student.lastName));
    }

    @Override
    public int compareTo(Student o) {
        return this.numberOfStudent.compareTo(o.numberOfStudent);
    }

    
}
