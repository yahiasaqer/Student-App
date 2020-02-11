package studentapp;
import java.io.Serializable;
public class ItStudent extends Student implements Serializable{
    int Mid;
    int Project;
    int Final;
    
    public ItStudent(int Mid, int Project, int Final,
            int ID, String Name, String Major) {
        super(ID, Name, Major);
        this.Mid = Mid;
        this.Project = Project;
        this.Final = Final;
        Grade = Mid*0.30 + Project*0.30 + Final*40;
    }
    
    
    @Override
    public int getMid() {
        return Mid;
    }

    public void setMid(int Mid) {
        this.Mid = Mid;
    }

    @Override
    public int getASS() {
        return Project;
    }

    public void setProject(int Project) {
        this.Project = Project;
    }

    @Override
    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        this.Final = Final;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override

    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String getMajor() {
        return Major;
    }

    @Override
    public void setMajor(String Major) {
        this.Major = Major;
    }

    @Override
    public double getGrade() {
        
        return Grade;
    }

    
}
