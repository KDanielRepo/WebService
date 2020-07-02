package com.pkisi.kdaniel.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class WebController implements WebMvcConfigurer {
    @Autowired
    PrzesylkaRepo przesylkaRepo;

    @GetMapping("/results")
    public String result() {
        return "results";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "login", required = false) String login, @RequestParam(value = "password", required = false) String password, Infos infos) {
        //infos.setInfo("test");
        infos.setInfo("");
        if (login != null && password != null) {
            if (!login.equals("test") || !password.equals("te")) {
                infos.setInfo("Podano nie poprawyny login lub haslo");
            } else if (login.equals("test") && password.equals("te")) {
                infos.setInfo("wow dziala");
            }
        }
        return "login";
    }
    @GetMapping("/warehouse")
    public String warehouse(Model model){
        List<String> names = new ArrayList<>();
        names.add("adam");
        names.add("pawel");
        names.add("roman");
        String info = "testowanie";
        model.addAttribute("names",names);
        model.addAttribute("info",info);
        return "warehouse";
    }


    @GetMapping("/index")
    //@ModelAttribute("search")
    public String searchParcel(@RequestParam(value = "search", required = false) String order, Przesylka przesylka) {
        if (order != null && !order.equals("")) {
            przesylka.setKoszt(500);
        }
        return "index";
    }
}





/*@GetMapping
    public String res(){
        return "index";
    }*/
    /*@GetMapping
    public void submit(@ModelAttribute("search") String info){
        System.out.println(info);
        if(!info.equals("") && !info.equals(null) && !info.equals(" ")) {
            if (info.equals("test")) {
                info = "paczka1";
            } else {
                info = "paczka2";
            }
            System.out.println(info);
            //return "/index/"+info;
        }
        //return "/index";
    }*/


//@PostMapping(value = "/index")
    /*@GetMapping(value = "/index/{info}")
    @ResponseBody
    public String cos(@PathVariable("info") String order){
        return "twoja paczka to "+order;
    }*/

    /*@GetMapping("/index")
    public String index(){return "index";}*/