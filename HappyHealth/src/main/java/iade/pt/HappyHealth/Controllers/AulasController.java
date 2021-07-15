package iade.pt.HappyHealth.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iade.pt.HappyHealth.Models.Aula;
import iade.pt.HappyHealth.Models.Repository.AulasRepositorio;

@RestController
    @RequestMapping(path="/api/aulas")
    
    public class AulasController {
    private Logger logger = LoggerFactory.getLogger(AulasController.class);
    @Autowired
    private AulasRepositorio AulasRepositorio;
  

    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Aula> getAula() {
        logger.info("Enviando todas as aulas");
        return AulasRepositorio.findaulas();
    }

    @GetMapping(path ="/Nome/{auNome}", produces= MediaType.APPLICATION_JSON_VALUE)

    public Iterable<Aula> Consulaulanome(@PathVariable String auNome)
                                               
    {
        logger.info("Consultando as aula de tipo"+auNome);
        return AulasRepositorio.Consulaulanome(auNome);
    }
    
    @GetMapping(path ="/Local/{auLocal}", produces= MediaType.APPLICATION_JSON_VALUE)

    public Iterable<Aula> ConsulaulaLocal(@PathVariable String auLocal)
                                               
    {
        logger.info("Consultando as aula de tipo"+auLocal);
        return AulasRepositorio.ConsulaulaLocal(auLocal);
    }

    @GetMapping(path ="/Tipo/{auTipo}", produces= MediaType.APPLICATION_JSON_VALUE)

    public Iterable<Aula> Consulaula(@PathVariable String auTipo)
                                               
    {
        logger.info("Consultando as aula de tipo"+auTipo);
        return AulasRepositorio.ConsulaulaTipo(auTipo);
    }

}

