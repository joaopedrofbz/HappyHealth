package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Utilizador;


public interface UtilizadorRepositorio extends CrudRepository<Utilizador,Integer> {
    
    String EcontraPonSuperior= ("Select * FROM utilizadores  ORDER BY Ut_totalPontos desc"); // Mostra todos os uts e organiza por pontos 

    @Query(value=EcontraPonSuperior,nativeQuery = true)
    Iterable<Utilizador> EcontraPonSuperior();
    
                            
    
}   
