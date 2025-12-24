/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.EmployeePackage;

import java.util.ArrayList;
import Week14.JobPackage.Job;
import Week14.JobPackage.Manager;
import Week14.JobPackage.Officer;
/**
 *
 * @author ali.nizam
 */
public class Employee {
    private String firstName;
    String lastName;
    private Job jobs[];
    ArrayList <String> addresses=new ArrayList<>();
    Department department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
     public Job[] getJobs() {
        return jobs;
    }

    public void setJobs(Job[] jobs){
        this.jobs=jobs;
    } 
    
    int getEmployeeSalary(){
        int totalSalary=0;
        for (Job job : jobs) {
            totalSalary+=job.getJobSalary();
        }
        return totalSalary;
    }
    
    void setJobSalary(Job j, int increment){
        for (Job job : jobs) {
            if (job.getJobName().equals(j.getJobName())){
                job.setSalary(job.getJobSalary()+increment);
            }
        } 
    }
    
    boolean isOfficer(){
        boolean result=false;
        if (jobs==null) return false;
        for (Job job : jobs) {
            if (job !=null && job instanceof Officer){
                result=true;
                break;
            }
        }
        return result;
    }
    
    void writeJobCount (){
        int jobCount[]=new int[4];
        String[] jobTypes={"SpecialJob","Officer","Manager","Job"};
        for (Job job : jobs) {
            if (job instanceof SpecialJob){
                jobCount[0]++; 
            }else if (job instanceof Officer){
                jobCount[1]++; 
            }else if (job instanceof Manager){
                jobCount[2]++; 
            } else if (job instanceof Job){
                jobCount[3]++; 
            }
        }
        
        for (int i = 0; i < jobCount.length; i++) {
            System.out.println(jobTypes[i]+" : "+jobCount[i]);
        }
            
        
    
    
    }

}
