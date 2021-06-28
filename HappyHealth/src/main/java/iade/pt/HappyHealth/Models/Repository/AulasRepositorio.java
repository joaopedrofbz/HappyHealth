package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Aula;

public interface AulasRepositorio extends CrudRepository<Aula,Integer>{

   @Query( value = "Select * from aulas where au_tipo=:auTipo",nativeQuery = true) //filtra aulas por tipo
    Iterable<Aula> Consulaula(@Param("auTipo") String AuTipo);

}
