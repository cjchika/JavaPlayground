package com.cjchika.jobapp_rest_api;

import com.cjchika.jobapp_rest_api.model.JobPost;
import com.cjchika.jobapp_rest_api.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("posts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
       return service.getAllJobs();
    }
}
