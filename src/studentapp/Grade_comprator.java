package studentapp;

import java.util.Comparator;


public class Grade_comprator implements Comparator<Student>{  
    
    @Override
    public int compare(Student o1,Student o2){  
        if(o1.getGrade() < o2.getGrade())  
            return 1;
        else  
            return-1;
        }  
    
}
