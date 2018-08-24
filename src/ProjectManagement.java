// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The Project Management class creates, removes, lists, finds,
//               and delegates sorting.

import java.io.Serializable;

public class ProjectManagement implements Serializable{
    private Project[] projectList;
    private int currentProjectsCount;
    private int maxSize;

    //Constructor
    public ProjectManagement(int maxSize){
        this.maxSize = maxSize;
        projectList = new Project[maxSize];
        for(int i = 0; i < projectList.length; i++){
            projectList[i] = null;
        }
        currentProjectsCount = 0;
    }

    //Search for project based on project number
    public int projectNumberExists(int projectNumber){
        if(projectList.length > 0){
            for(int i = 0; i < currentProjectsCount; i++){
                if(projectList[i].getProjNumber() == projectNumber){
                    return i;
                }
            }
        }
        return -1;
    }

    //Search for project based on Manager information
    public int managerExists(String firstName, String lastName, int deptNumber){
        if(projectList.length > 0){
            for(int i = 0; i < currentProjectsCount; i++){
                if(projectList[i].getProjManager().getFirstName().equals(firstName)){
                    if(projectList[i].getProjManager().getLastName().equals(lastName)){
                        if(projectList[i].getProjManager().getDeptNum() == deptNumber){
                            return 1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    //Add project and add to porjectList
    public boolean addProject(String projTitle, int projNumber, String projLocation, String firstName, String lastName, int deptNum){
        if(currentProjectsCount < maxSize){
            for(int i = 0; i < projectList.length; i++){
                if(projectList[i] != null){
                    if(projectList[i].getProjNumber() == projNumber) {
                        return false;
                    }
                }
            }
            //Set all input variables to new project
            for(int i = 0; i < projectList.length; i++){
                if(projectList[i] == null){
                    projectList[i] = new Project();
                    projectList[i].setProjTitle(projTitle);
                    projectList[i].setProjNumber(projNumber);
                    projectList[i].setProjLocation(projLocation);
                    projectList[i].setProjManager(firstName, lastName, deptNum);
                    currentProjectsCount += 1;
                    return true;
                }
            }
        }
        return false;
    }

    //Remove project from projectList
    public boolean removeProjectNumber(int projectNumber){
        for(int i = 0; i < currentProjectsCount; i++){
            if(projectList[i].getProjNumber() == projectNumber) {
                projectList[i] = null;
                currentProjectsCount -= 1;
                return true;
            }
        }
        return false;
    }

    //Will send information about projectList to be sorted by project number
    //Passes in a Number Comparator to Sort class
    public void sortByProjectNumber(){

        Sorts.sort(projectList, projectList.length, new ProjectNumberComparator());
    }

    //Will send information about projectList to be sorted by Manager
    //Passes in a Manager Comparator to Sort class
    public void sortByManager(){
        Sorts.sort(projectList, projectList.length, new ManagerComparator());
    }

    //List projects
    public String listProjects(){
        String toString = "\n";
        if(currentProjectsCount > 0){
            for(int i = 0; i < projectList.length; i++){
                if(projectList[i] != null){
                    toString += projectList[i].toString();
                }
            }
            toString += "\n" + "";
        }
        else{
            toString = "\nno project\n\n";
        }
        return toString;
    }

    //Close all projects, reset max inputs and current project count
    public void closeProjectManagement(){
        projectList = null;
        maxSize = 0;
        currentProjectsCount = 0;
    }
}//end of Project Management class
