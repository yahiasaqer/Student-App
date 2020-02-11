package studentapp;

import java.io.Serializable;

public abstract class Student implements Serializable{
    int ID;
    String Name;
    String Major;
    double Grade;

    public Student(int ID, String Name, String Major) {
        this.ID = ID;
        this.Name = Name;
        this.Major = Major;
    }
    
    
    
    public abstract int getID();
    
    public  abstract void setID(int ID);
    
    public abstract  String getName();
    
    public abstract void setName(String Name);
    
    public abstract String getMajor();
    
    public abstract void setMajor(String Major);
    
    public abstract double getGrade();
    
    public abstract int getMid();
    
    public abstract int getFinal();
    
    public abstract int getASS();
    
    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Major=" + Major + ", Grade=" + Grade + '}';
    }
    
    
}
