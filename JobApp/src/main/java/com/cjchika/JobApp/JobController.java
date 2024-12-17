package com.cjchika.JobApp;


import com.cjchika.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home(){
        System.out.println("Hit Home");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        System.out.println("Hit");
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(){
        return "viewalljobs";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
}
