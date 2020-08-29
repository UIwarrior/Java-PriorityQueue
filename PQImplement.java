import java.util.PriorityQueue;
import java.util.List;
public class PQImplement<T> {
    public static void main(String[] arg) {
        PriorityQueue <Integer> PQ = new PriorityQueue <Integer> ();
        for(int i=2; i<=20; i=i+2) {
            PQ.add(new Integer (i));
        }
        int x= PQ.peek();
        int y= PQ.poll();
        int z= PQ.size();
    }
}