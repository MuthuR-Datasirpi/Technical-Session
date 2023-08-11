import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

class Collection{
    
    public static void main(String[] args) {
        //Array list
        List<String> obj=new ArrayList<String>();
        obj.add("Iphone");
        obj.add("Samsung");
        obj.add("Redmi");
        obj.add("infinix");
        obj.add("android");
        for(int i=0;i<obj.size();i++)
        {
            System.out.println("only obj output "+obj.get(i));
        }
        obj.add(1, "Muthu");
        System.out.println(obj);

        System.out.println("USing set()");
        obj.set(1, "deleted");
        System.out.println(obj);
        //Linked list
        List obj1=new LinkedList();
        obj1.addAll(obj);
        System.out.println(obj1);

        obj.clear();
        System.out.println(obj);

        //Vector
        Vector v=new Vector();
        v.add(20);
        v.add("red");
        v.add("hello");
        v.add(10);
        System.out.println(v);

        //set
        // Set demo with HashSet
        Set<String> Colors_Set = new HashSet<String>(); 
        Colors_Set.add("Red"); 
        Colors_Set.add("Green"); 
        Colors_Set.add("Blue"); 
        Colors_Set.add("Cyan"); 
        Colors_Set.add("Magenta"); 
        //print set contents
        System.out.print("Set contents:"); 
        System.out.println(Colors_Set); 
   
        // Set demo with TreeSet 
        System.out.print("\nSorted Set after converting to TreeSet:"); 

        Set<String> tree_Set = new TreeSet<String>(Colors_Set); 
        System.out.println(tree_Set); 


        //MAP
         Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

         // Creating Map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);


        

        

    }
}
