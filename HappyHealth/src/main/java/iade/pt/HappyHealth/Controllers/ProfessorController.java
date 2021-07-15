package iade.pt.HappyHealth.Controllers;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iade.pt.HappyHealth.Models.Professor;
import iade.pt.HappyHealth.Models.Repository.ProfessorRepositorio;
import javassist.NotFoundException;

@RestController
    @RequestMapping(path="/api/professores")
    
    public class ProfessorController {
    private Logger logger = LoggerFactory.getLogger(ProfessorController.class);
    @Autowired
    private ProfessorRepositorio professorRepositorio;
    
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Professor> getProfessor() {
        logger.info("Enviando todas os professores");
        return professorRepositorio.findAll();
    }

    @PostMapping(path ="/criaraula/{auNome}/{auTempo}/{auLocal}/{auTipo}/{auData}", produces= MediaType.APPLICATION_JSON_VALUE) 
        public Iterable<Professor> Inscreveraula(@PathVariable String auNome,@PathVariable int auTempo,@PathVariable String auLocal,
                                                    @PathVariable String auTipo,@PathVariable String auData)

        {
            logger.info("Registando nova aula, por favor aguarde");
            return professorRepositorio.Inscreveraula(auNome, auTempo, auLocal, auTipo, auData);
        }
    
    @GetMapping(path = "/{id:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE )
        public Professor getidProfessor(@PathVariable int id) throws NotFoundException {
            logger.info("A Enviar prof "+id);
            Optional<Professor> professor=professorRepositorio.findById(id);
            if (professor.isEmpty()) throw
                new NotFoundException(""+id);
            else return professor.get() ;
        }
    
    @GetMapping(path ="/genero/{genero}", produces= MediaType.APPLICATION_JSON_VALUE)

    public Iterable<Professor> Consulprofgenero(@PathVariable char genero)
                                                   
        {
            logger.info("Consultando os professores por genero "+genero);
            return professorRepositorio.Consulprofgenero(genero);
        }
    
}
