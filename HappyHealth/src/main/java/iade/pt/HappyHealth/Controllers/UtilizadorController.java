package iade.pt.HappyHealth.Controllers;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iade.pt.HappyHealth.Models.Utilizador;
import iade.pt.HappyHealth.Models.Repository.UtilizadorRepositorio;
import javassist.NotFoundException;


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

    @GetMapping(path = "/{UTid:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE )
    public Utilizador getidUtilizador(@PathVariable int UTid) throws NotFoundException {
        logger.info("A Enviar utilizador "+UTid);
        Optional<Utilizador> Utilizador=UtilizadorRepositorio.findById(UTid);
        if (Utilizador.isEmpty()) throw
            new NotFoundException(""+UTid);
        else return Utilizador.get() ;
    }
}
