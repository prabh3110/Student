package javasoftware;
/**
 *
 * @author manch
 */
import java.util.*;
public class Reverseworld {
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      System.out.println("Enter a word");
      String w=in.nextLine();
      char[] c= new char[w.length()];
      for(int i=0;i<w.length();i++) {
          c[i]=w.charAt(i);
      }
      for(int i=0;i<w.length();i++) {
        System.out.println(c[i]);
      }
      for(int j=w.length()-1;j>=0;j--) {
        System.out.print(c[j]);
      }
  }
}
