package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String returnCourse(){
        return "Blizzard";
    }
    @RequestMapping("/")
    public String home(){
//        String html = "<html>\n" +
//                "    <head>\n" +
//                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
//                "    </head>\n" +
//                "    </body>\n" +
//                "        <h2>Calculator</h2>\n" +
//                "\n" +
//                "         <form action=\"addAlien\">\n" +
//                "                <label for=\"aid\">Enter Id :</label>\n" +
//                "                <input type=\"text\" id=\"aid\" name=\"aid\"><br>\n" +
//                "                <label for=\"aname\">Enter Name :</label>\n" +
//                "                <input type=\"text\" id=\"aname\" name=\"aname\"><br>\n" +
//                "                <input type=\"submit\" value=\"Submit\">\n" +
//                "            </form>\n" +
//                "\n" +
//                "    </body>\n" +
//                "</html>";
        System.out.println("home method called...");
        return "index";
    }

    @RequestMapping("add")
    //public String add(HttpServletRequest req, HttpSession session){
    //public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , HttpSession session){
    //public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , Model model){
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , ModelAndView mv){
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));\
        int result=num1+num2;
        //session.setAttribute("result", result);
        //model.addAttribute("result", result);
        mv.setViewName("result");
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien) {
        return "result.jsp";
    }
}
