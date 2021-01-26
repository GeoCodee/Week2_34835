/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist;

/**
 *
 * @author Megha Patel
 */
public class PartTimeStudent extends Student{
    
    private int numCourses;
    
    public PartTimeStudent(String name, String id, String prog,int numc)
    {
        super(name,id,prog);
        numCourses=numc;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

}
