import java.util.*;

public class Library
{
    // instance variables - replace the example below with your own
    public int sign_up;
    public int daily_books;
    public List<Integer> to_scan;
    public int[] scores;

    public Library(int ssign, int db, int[] books, int[] sscores)
    {
        this.sign_up = ssign;
        this.daily_books = db;
        this.to_scan = new LinkedList<Integer>();
        for(Integer i : books){
            to_scan.add(i);
        }
        this.scores = sscores;
    }
    
    public List<Integer> max_throughput(){
        return new LinkedList<Integer>();
    }
    public List<Integer> restricted_throughput(List<Integer> restricted) {
        return new LinkedList<Integer>(); 
    }
}
