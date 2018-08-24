// Assignment #: 8
//         Name: Madison Green
//    StudentID: 1211017974
//      Lecture: TTH 10:30
//  Description: The Sorts class will sort the projects in
//               projectList by either Manager information or Project number
//               depending on the comparator passed into sort method

import java.util.Comparator;

public class Sorts {
    //Will take all projects and iterate to the current project size
    //Sort based on comparator passed as argument
    public static void sort(Project[] projectList, int size, Comparator<Project> comparator){

        int min;
        Project temp;

        for (int index = 0; index < size; index++)
        {
            min = index;
            for (int scan = index+1; scan < size; scan++){
                if(projectList[min] != null && projectList[scan] != null){
                    if (comparator.compare(projectList[min], projectList[scan]) > 0){
                        min = scan;
                    }
                }
            }

            // Swap the values to order array
            temp = projectList[min];
            projectList[min] = projectList[index];
            projectList[index] = temp;
        }

    }
}
