package iade.pt.HappyHealth.Controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iade.pt.HappyHealth.Models.Professor;
import iade.pt.HappyHealth.Models.Repository.ProfessorRepositorio;

@RestController
    @RequestMapping(path="/api/professor")
    
    public class ProfessorController {
    private Logger logger = LoggerFactory.getLogger(ProfessorController.class);
    @Autowired
    private ProfessorRepositorio professorRepositorio;
    
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Professor> getProfessor() {
        logger.info("Enviando todas os professores");
        return professorRepositorio.findAll();
    }

    @PostMapping(path ="/criaraula/{​​​auNome}​​​/{​​​auTempo}​​​/{​​​auLocal}​​​/{​​​auTipo}​​​/{​​​auData}​​​", produces= MediaType.APPLICATION_JSON_VALUE) // esta instrução nao funciona porque por default o chrome
                                                                                                                                // so faz gets se colocarmos a correr no postman funcionará
                                                                                                                                //outra opçao seria adicionar method=RequestMethod.Post 
                                                                                                                                //nao pusemos pois dava erro na palavra method
    public Iterable<Professor> Inscreveraula(@PathVariable String auNome,@PathVariable int auTempo,@PathVariable String auLocal,
                                                @PathVariable String auTipo,@PathVariable String auData)
    {​​​
        logger.info("Registando nova aula, por favor aguarde");
        return professorRepositorio.Inscreveraula(auData, auTempo, auData, auData, auData);
    }
}
