package studentapp;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentApp {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Grade_comprator S_C = new Grade_comprator();
        
        Student[] STD = new Student[6];
        
        STD[0] = new ArtStudent(35, 8, 40, 120, "", "");
        STD[1] = new ArtStudent(25, 6, 35, 121, "", "");
        STD[2] = new ArtStudent(40, 10, 50, 122, "", "");
        STD[3] = new ItStudent(22, 30, 50, 123, "", "");
        STD[4] = new ItStudent(10, 10, 40, 124, "", "");
        STD[5] = new ItStudent(4, 4, 20, 125, "", "");
        
        for (Student student : STD) {
           if(student != null){
                System.out.println(student.toString());
           }
        }
        Student Temp;
//        int i =1;
//        while(i != STD.length){
//        if (S_C.compare(STD[i - 1], STD[i]) == 1 &&
//                S_C.compare(STD[i], STD[i + 1]) == 1) {
//            
//        } else if (S_C.compare(STD[i - 1], STD[i]) != 1) {
//                       Temp = STD[i];
//                       STD[i] = STD[i - 1];
//                       STD[i - 1] = Temp;
//        } else if(S_C.compare(STD[i], STD[i + 1]) !=  1) {
//                       Temp = STD[i + 1];
//                       STD[i + 1] = STD[i];
//                       STD[i] = Temp;
//        
//    }
//        ++i;
//
//        }

            for (int i = 0; i < STD.length; i++) {
                for (int j = 0; j < STD.length; j++) {
                   if (S_C.compare(STD[i], STD[j]) == 1) {
                       Temp = STD[i];
                       STD[i] = STD[j];
                       STD[j] = Temp;
                   }
                   
               }
            }
            System.out.println("///////////////////////////////////////////////////////////////////");
            
            for (Student student1 : STD) {
                if(student1 != null){
                    System.out.println(student1.toString());
           }
            }
                try{new File("A:\\Documents\\Record.txt"); 
                FileOutputStream fos = new FileOutputStream("A:\\Documents\\Record.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(STD);
                oos.close();
                }catch (FileNotFoundException e) {
    
                System.out.println("try again ");
                }
    
        }

    
    }

