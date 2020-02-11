package studentapp;
import java.io.Serializable;

public class ArtStudent  extends Student implements Serializable{
    int Mid;
    int Report;
    int Final;

    public ArtStudent(int Mid, int Report, int Final,
            int ID, String Name, String Major) {
        super(ID, Name, Major);
        this.Mid = Mid;
        this.Report = Report;
        this.Final = Final;
        Grade = Mid*0.40 + Report*0.10 + Final*50;
        
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
        return Report;
    }

    public void setReport(int Report) {
        this.Report = Report;
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
