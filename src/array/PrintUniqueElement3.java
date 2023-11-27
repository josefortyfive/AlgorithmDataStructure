package array;
 

import java.io.*;
import java .util.*;
 
public class PrintUniqueElement3 
{
  public static void main (String[] args) 
  {
    List<Integer>v = new ArrayList<Integer>();
    v.add(10);
    v.add(5);
    v.add(3);
    v.add(4);
    v.add(3);
    v.add(5);
    v.add(6);
 
    SortedSet<Integer> s = new TreeSet<Integer>();
 
    for(int i=0; i<v.size(); i++)
      s.add(v.get(i));
 
    System.out.print("All the distinct element in given vector in sorted order are: ");
    for (Integer value : s)
      System.out.print(value+" ");
  }
}
 

