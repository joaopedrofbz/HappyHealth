package iade.pt.HappyHealth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iade.pt.HappyHealth.Models.Aula;
import iade.pt.HappyHealth.Models.Repository.AulasRepositorio;

@Controller


public class AppController {
    @Autowired
    AulasRepositorio repo;

    @RequestMapping("/")
    public String indexpage(Model model)
    {
        List<Aula> Au=(List<Aula>) repo.findAll();
        model.addAttribute("aulist",Au);
        return "index";
    }   
}
