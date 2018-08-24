// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The Manager class describes a manager.
//               It also provides their accessor, mutator methods,
//               and toString method.


import java.io.Serializable;

public class Manager implements Serializable
{

    private String firstName;
    private String lastName;
    private int deptNum;

    /************************************************************************
     Constructor method to initialize intance variables.
     ************************************************************************/
    public Manager()
    {
        firstName = new String("?");
        lastName= new String("?");
        deptNum = 0;
    }

    /************************************************************************
     Accessor methods
     ************************************************************************/
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getDeptNum()
    {
        return deptNum;
    }

    /************************************************************************
     Modifier methods
     ************************************************************************/
    public void setFirstName(String someFirstName)
    {
        firstName = someFirstName;
    }

    public void setLastName(String someLastName)
    {
        lastName = someLastName;
    }

    public void setDeptNum(int someDeptNum)
    {
        deptNum = someDeptNum;
    }

    /*****************************************************************************
     This method return a string containing the attribute information of a manager
     *****************************************************************************/
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + ", Dept Num:" + deptNum;

        return result;
    }
    /*****************************************************************************
     This method sets one manager's variables equal to another's
     *****************************************************************************/
    public void copy(Manager other){
        this.setFirstName(other.getFirstName());
        this.setLastName(other.getLastName());
        this.setDeptNum(other.getDeptNum());
    }

}//end of Manager class

