import java.io.*;
import java.util.*; 

public class TestClass
{
    
    
    public static void main(String[] args) throws Exception {
      File file = new File("//home//cesar//Downloads//a_example.txt"); 
  
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      
      // Line 1
      String st1 = br.readLine();
      String[] st11 = st1.split(" ");
      
      int n_books = Integer.parseInt(st11[0]);
      int n_libraries = Integer.parseInt(st11[1]);
      int n_days = Integer.parseInt(st11[2]);
      
      // Books
      
      String st2 = br.readLine();
      int[] scores = string_to_int_arr(st2);
      String[] st22 = st2.split(" ");
      List<Book> books = new LinkedList<Book>();
      
      for(int i = 0; i < n_books; i++){
          Book nb = new Book(i, Integer.parseInt(st22[i]));
          books.add(nb);
      }
      
      //Libraries
      List<Library> libraries = new LinkedList<Library>();
      for(int i = 0; i < n_libraries; i++){
          st1 = br.readLine();
          int[] bs1 = string_to_int_arr(st1);
          st2 = br.readLine();
          int[] bz = string_to_int_arr(st2);
          Library lb = new Library(bs1[1], bs1[2], bz, scores);
          libraries.add(lb);
      }      
      
      //Collections.sort(studentList, Comparator.comparing(s -> s.getBirthday()));
      System.out.println("Safe");
    }
    
    public static int[] string_to_int_arr(String ss){
        String[] sb = ss.split(" ");
        int[] res = new int[sb.length];
        for(int i = 0; i < sb.length; i++){
            res[i] = Integer.parseInt(sb[i]);
        }
        return res;
    } 
}
