package com.mani.spring_boot_rest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class JobPost {
    @Id
    private int jobId;
    private String jobTitle;
    private String description;
    private int experience;
    private List<String> techSkills;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDesc() {
        return description;
    }

    public void setJobDesc(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(List<String> techSkills) {
        this.techSkills = techSkills;
    }

    public JobPost(int jobId, String jobTitle, String description, int experience, List<String> techSkills) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.description = description;
        this.experience = experience;
        this.techSkills = techSkills;
    }
    public JobPost(){
        //No args Constructor
    }
}
