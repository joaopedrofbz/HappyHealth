package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Utilizador;


public interface UtilizadorRepositorio extends CrudRepository<Utilizador,Integer> {
    
    String EcontraPonSuperior= ("Select * FROM utilizadores  ORDER BY Ut_totalPontos desc"); // Mostra todos os uts e organiza pos pontos , infelixmente nao consegui mostrar apenas o nome apelido e pontos 

    @Query(value=EcontraPonSuperior,nativeQuery = true)
    Iterable<Utilizador> EcontraPonSuperior();
    
                            
   
    
}   
