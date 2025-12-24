/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.JobPackage;

/**
 *
 * @author ali.nizam
 */
public class Job {
    private int salary;
    private String jobName;

    public Job(int salary,String jobName ) {
        this.salary = salary;
        this.jobName = jobName; 
    } 
    
    
    

    public int getJobSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    
    
}
