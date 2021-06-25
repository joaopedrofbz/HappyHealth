package iade.pt.HappyHealth.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iade.pt.HappyHealth.Models.Utilizador;
import iade.pt.HappyHealth.Models.Repository.UtilizadorRepositorio;


@RestController
    @RequestMapping(path="/api/utilizador")
    
    public class UtilizadorController {
    private Logger logger = LoggerFactory.getLogger(UtilizadorController.class);
    @Autowired
    public UtilizadorRepositorio UtilizadorRepositorio;

    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getProfessor() {
        logger.info("Enviando todas os utilizadores");
        return UtilizadorRepositorio.findAll();
    }

    //ADICIONAR FILTRO DE UT´S POR PONTOS 
}
