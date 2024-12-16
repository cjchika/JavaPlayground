package com.cjchika.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv){

        int res = num1 + num2;

        mv.addObject("result", res);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien, ModelAndView mv){

        return "result";
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

//    @RequestMapping("add")
//    public String add(int num1, int num2, Model model){
//
//        int res = num1 + num2;
//
//        model.addAttribute("result", res);
//
//        return "result";
//    }

//    public String add(HttpServletRequest req, HttpSession session){
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int res = num1 + num2;
//
//        session.setAttribute("result", res);
//
//        return "result.jsp";
//    }
}
