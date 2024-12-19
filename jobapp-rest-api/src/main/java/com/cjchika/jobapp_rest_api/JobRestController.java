package com.cjchika.jobapp_rest_api;

import com.cjchika.jobapp_rest_api.model.JobPost;
import com.cjchika.jobapp_rest_api.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("posts")
    public List<JobPost> getAllJobs(){
       return service.getAllJobs();
    }

    @GetMapping("posts/search/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.searchByKeyword(keyword);
    }

    @GetMapping("post/{jobId}")
    public JobPost getJob(@PathVariable int jobId){
        return service.getJob(jobId);
    }

    @PostMapping("post")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("post")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
       return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("post/{jobId}")
    public String deleteJob(@PathVariable int jobId){
        service.deleteJob(jobId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "Hit";
    }
}
