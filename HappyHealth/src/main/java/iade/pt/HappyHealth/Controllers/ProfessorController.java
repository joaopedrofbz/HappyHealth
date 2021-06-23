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
    private ProfessorRepositorio ProfessorRepositorio;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Professor> getProfessor() {
        logger.info("Enviando todas os professores");
        return ProfessorRepositorio.findAll();
    }
}
