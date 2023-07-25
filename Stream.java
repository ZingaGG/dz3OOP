import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentsGroup>{
    private List<StudentsGroup> studentsGroups;

    public Stream(){
        studentsGroups = new ArrayList<>();
    }

    public void addGroup(StudentsGroup studentsGroup){
        studentsGroups.add(studentsGroup);
    }

    public Integer sizeStream(){
        return studentsGroups.size();
    }

    @Override
    public Iterator<StudentsGroup> iterator() {
        return studentsGroups.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (StudentsGroup studentsGroup : studentsGroups) {
            sb.append(studentsGroup.toString()).append("\n");
        }
        return sb.toString();
    }  
}
