// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The Project Number Comparator class will sort the projects in
//               projectList by project number
//               Will be used in sort class to sort projects

import java.util.Comparator;

//Sort porjects by project number, the lowest number will come first
public class ProjectNumberComparator implements Comparator<Project> {
    public int compare(Project first, Project second){
        int one = first.getProjNumber();
        int two = second.getProjNumber();

        if(one < two){
            return -1;
        }
        else if(one > two){
            return 1;
        }
        else{
            return 0;
        }
    }
}
