public class StreamController {
    private StreamService streamServices = new StreamService();

    public static void main(String[] args) {
        Student student1 = new Student(1, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(2, "Петров", "Иван", "Иванович");
        Student student3 = new Student(3, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(4, "Козлов", "Иван", "Иванович");

        StudentsGroup studentsGroup1 = new StudentsGroup();
        studentsGroup1.addStudent(student1);


        StudentsGroup studentsGroup2 = new StudentsGroup();
        studentsGroup2.addStudent(student2);
        studentsGroup2.addStudent(student3);

        StudentsGroup studentsGroup3 = new StudentsGroup();
        studentsGroup3.addStudent(student4);

        Stream stream = new Stream();
        stream.addGroup(studentsGroup1);
        stream.addGroup(studentsGroup2);
        

        // System.out.println(stream);

        Stream stream1 = new Stream();
        stream1.addGroup(studentsGroup3);

        StreamService streamService1 = new StreamService();
        streamService1.addStream(stream);
        streamService1.addStream(stream1);

        
        System.out.println(streamService1);

        System.out.println("----------------");

        streamService1.sortStreams();

        System.out.println(streamService1);

        // Как видно по выводу меньшая группа отсортировалась и встала на первое место
    }
}
