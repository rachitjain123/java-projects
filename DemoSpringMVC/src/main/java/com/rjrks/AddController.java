package com.rjrks;

import com.rjrks.com.rjrks.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping(value = "/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
        AddService as = new AddService();
        int k = as.add(i, j);
        ModelAndView mv  = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",k);
        return mv;
     }
}
