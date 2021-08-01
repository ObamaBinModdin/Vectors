/**
 * Project: Project1
 * Completion Time: 4 hours give or take.
 * 
 * Honor Code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package package1;

import java.util.*;

/**
 *
 * @author oscar
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        List<MyVector> vectors=new ArrayList<MyVector>();
        
        double list1[]={1,2,3,4,5};
        double list2[]={1,2,3,4,5};
        double list3[]={5,4,3,2,1};
        double list4[]={2.3,2.3};
        double list5[]={};
        
        vectors.add(new MyVector(list1));
        vectors.add(new MyVector(list2));
        vectors.add(new MyVector(list3));
        vectors.add(new MyVector(list4));
        vectors.add(new MyVector(list5));
        vectors.add(new MyVector(vectors.get(0)));//Copy Constructor works.
        
        System.out.println("Vector size: "+vectors.get(0).size()+ " | Expected: 5");//size method works
        System.out.println("Vector size: "+vectors.get(4).size()+ " | Expected: 0");
        
        System.out.println("Element at index 4: "+vectors.get(2).get(4)+" | Expected 1");//get method works
        
        vectors.add(new MyVector(vectors.get(0).plus(vectors.get(1))));//plus method works
        System.out.println(vectors.get(6).toString());
        
        vectors.add(new MyVector(vectors.get(0).minus(vectors.get(1))));//minus method works
        System.out.println(vectors.get(7).toString());
        
        vectors.add(new MyVector(vectors.get(0).scaledBy(3)));//scaledBy method works
        System.out.println(vectors.get(8).toString());
        
        System.out.println(vectors.get(8).dot(vectors.get(0)));//dot method works
        System.out.println(vectors.get(0).dot(vectors.get(0)));
        
        System.out.println(vectors.get(0).equals(vectors.get(1)));//equals method works
        System.out.println(vectors.get(0).equals(vectors.get(2)));
        
        System.out.println(vectors.get(0).abs());//abs method works
        
        int size=vectors.size();
        for(int x=0;x<size;x++)
        {
            System.out.println(vectors.get(x).toString());//toString works
        }
    }//Main class
    
}
