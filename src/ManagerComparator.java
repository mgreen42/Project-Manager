// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The Manager Comparator class will sort the projects in
//               projectList by department number, then first name then last name
//               Will be used in sort class to sort projects

import java.util.Comparator;

public class ManagerComparator implements Comparator<Project> {

    //Define abstract method of comparator to compare by manager information
    public int compare(Project first, Project second) {
        Manager manageOne = first.getProjManager();
        Manager manageTwo = second.getProjManager();
        if (manageOne.getDeptNum() < manageTwo.getDeptNum()) {
            return -1;
        } else if (manageOne.getDeptNum() > manageTwo.getDeptNum()) {
            return 1;
        } else {
            if (manageOne.getFirstName().compareTo(manageTwo.getFirstName()) > 0) {
                return 1;
            } else if (manageOne.getFirstName().compareTo(manageTwo.getFirstName()) < 0) {
                return -1;
            } else {
                if (manageOne.getLastName().compareTo(manageTwo.getLastName()) > 0) {
                    return 1;
                } else if (manageOne.getLastName().compareTo(manageTwo.getLastName()) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}//end of Manager Comparator class


