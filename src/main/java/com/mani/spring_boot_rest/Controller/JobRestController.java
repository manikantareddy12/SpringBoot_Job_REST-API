package com.mani.spring_boot_rest.Controller;

import com.mani.spring_boot_rest.Model.JobPost;
import com.mani.spring_boot_rest.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("getJobs")
    public List<JobPost> getALlJobs(){
        return service.getAllJobs();
    }

    @GetMapping("getJob/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("addJob")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getJobId());
    }

    @PutMapping("updateJob")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getJobId());
    }

    @DeleteMapping("deleteJob/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }





}
