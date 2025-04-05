package com.mani.spring_boot_rest.Service;


import com.mani.spring_boot_rest.Model.JobPost;
import com.mani.spring_boot_rest.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }
    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }
    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Develops backend services using Java and Spring Boot", 2, Arrays.asList("Java", "Spring", "SQL")),
                new JobPost(2, "Frontend Developer", "Creates responsive web interfaces using JavaScript, HTML, and CSS", 3, Arrays.asList("JavaScript", "HTML/CSS")),
                new JobPost(3, "Full Stack Developer", "Handles both frontend and backend development", 4, Arrays.asList("Java", "Spring", "JavaScript", "SQL", "HTML/CSS")),
                new JobPost(4, "QA Engineer", "Ensures software quality with automated and manual testing", 2, Arrays.asList("Selenium", "JUnit", "SQL")),
                new JobPost(5, "DevOps Engineer", "Manages deployment pipelines and cloud infrastructure", 3, Arrays.asList("Docker", "Kubernetes", "Jenkins")),
                new JobPost(6, "Data Engineer", "Builds and maintains data pipelines for analytics", 4, Arrays.asList("Java", "SQL", "Spark"))
        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByJobTitleContainingOrDescriptionContaining(keyword,keyword);
    }
}
