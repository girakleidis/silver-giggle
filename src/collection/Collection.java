/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;

import java.util.HashMap;
import java.util.HashSet;
import models.Course;
import models.Student;

/**
 *
 * @author gei
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        HashSet<Student> set = new HashSet();
//        Student s =new Student("a","b",0);
//        set.add(new Student("g","i",250));
//        set.add(new Student("d","i",500));
//        set.add(new Student("i","i",5000));
//        set.add(s);
//        set.add(s);
            Student s = new Student("g","i",2500);
            Course c1 =new Course("Java");
            Course c2 =new Course("DB");
            s.addCourse(c1);
            s.addCourse(c2);
            
            System.out.println(s);
            
            
//        System.out.println(set.size());
//        System.out.println(set);
        
                
//          HashMap<Student,Integer> map = new HashMap();
//          map.put(s,0);
//          map.put(new Student("g","i",2500),2500);
//          map.put(new Student("g","i",2500),1100);
//          map.put(new Student("g","i",2500),1500);
//          System.out.println(map);
         
//          System.out.println(map.keySet());
          
        }
    }
    
//}
