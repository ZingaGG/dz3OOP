import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public StreamService(){
        streams = new ArrayList<>();
    }

    public void addStream(Stream stream){
        streams.add(stream);
    }

    public void sortStreams(){
        StreamComparator comparator = new StreamComparator();
        streams.sort(comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Stream stream : streams) {
            sb.append(stream.toString()).append("\n");
        }
        return sb.toString();
    }

    
}
