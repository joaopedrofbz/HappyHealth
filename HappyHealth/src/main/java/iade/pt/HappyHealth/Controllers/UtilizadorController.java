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
    @RequestMapping(path="/api/utilizadores")
    
    public class UtilizadorController {
    private Logger logger = LoggerFactory.getLogger(UtilizadorController.class);
    @Autowired
    private UtilizadorRepositorio UtilizadorRepositorio;
        
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUtilizadores() {
        logger.info("Enviando todas os utilizadores");
        return UtilizadorRepositorio.findAll();
    }
    
    @GetMapping(path ="/Leaderboard", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUtilizadoresPontos()
    {
        logger.info("A carregar a Leadearboard");
        return UtilizadorRepositorio.EcontraPonSuperior();

    }

    

    
    //ADICIONAR FILTRO DE UT´S POR PONTOS 
}
