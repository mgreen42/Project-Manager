// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The class Project represents a project with variables
//               title, number, location, and object manager


import java.io.Serializable;

public class Project implements Serializable
{
    private String projTitle;
    private int projNumber;
    private String projLocation;
    private Manager projManager;

    //Constructor to initialize all member variables
    public Project()
    {
        projTitle = "?";
        projNumber = 0;
        projLocation = "?";
        projManager = new Manager();
    }

    //Accessor methods
    public String getProjTitle()
    {
        return projTitle;
    }

    public int getProjNumber()
    {
        return projNumber;
    }

    public String getProjLocation()
    {
        return projLocation;
    }

    public Manager getProjManager()
    {
        return projManager;
    }

    //Mutator methods
    public void setProjTitle(String aTitle)
    {
        projTitle = aTitle;
    }

    public void setProjNumber(int aNumber)
    {
        projNumber = aNumber;
    }

    public void setProjLocation(String aLocation)
    {
        projLocation = aLocation;
    }

    public void setProjManager(String first, String last, int deptNum)
    {
        projManager.setFirstName(first);
        projManager.setLastName(last);
        projManager.setDeptNum(deptNum);
    }


    //Returns a string containg its title, number, location and manager
    public String toString()
    {
        String result = "\nProject Title:\t\t" + projTitle
                + "\nProject Number:\t\t" + projNumber
                + "\nProject Location:\t" + projLocation
                + "\nProject Manager:\t"
                + projManager.toString() + "\n\n";
        return result;
    }

    //Copys all variables of project to called project
    public void copy(Project other){
        this.setProjTitle(other.getProjTitle());
        this.setProjLocation(other.getProjLocation());
        this.setProjNumber(other.getProjNumber());
        this.setProjManager(other.projManager.getFirstName(), other.projManager.getFirstName(), other.projManager.getDeptNum());
    }
}