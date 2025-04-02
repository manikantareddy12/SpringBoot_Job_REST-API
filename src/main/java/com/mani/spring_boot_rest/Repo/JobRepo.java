package com.mani.spring_boot_rest.Repo;

import com.mani.spring_boot_rest.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Develops backend services using Java and Spring Boot", 2, Arrays.asList("Java", "Spring", "SQL")),
            new JobPost(2, "Frontend Developer", "Creates responsive web interfaces using JavaScript, HTML, and CSS", 3, Arrays.asList("JavaScript", "HTML/CSS")),
            new JobPost(3, "Full Stack Developer", "Handles both frontend and backend development", 4, Arrays.asList("Java", "Spring", "JavaScript", "SQL", "HTML/CSS")),
            new JobPost(4, "QA Engineer", "Ensures software quality with automated and manual testing", 2, Arrays.asList("Selenium", "JUnit", "SQL")),
            new JobPost(5, "DevOps Engineer", "Manages deployment pipelines and cloud infrastructure", 3, Arrays.asList("Docker", "Kubernetes", "Jenkins")),
            new JobPost(6, "Data Engineer", "Builds and maintains data pipelines for analytics", 4, Arrays.asList("Java", "SQL", "Spark"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {
        for(JobPost job: jobs){
            if(job.getJobId() == postId)
                return job;
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs){
            if(jobPost1.getJobId() == jobPost.getJobId()){
                jobPost1.setJobTitle(jobPost.getJobTitle());
                jobPost1.setJobDesc(jobPost.getJobDesc());
                jobPost1.setExperience(jobPost.getExperience());
                jobPost1.setTechSkills(jobPost.getTechSkills());
            }
        }
    }

    public void deleteJob(int jobId) {
        jobs.removeIf(jobPost -> jobPost.getJobId() == jobId);
    }
}
