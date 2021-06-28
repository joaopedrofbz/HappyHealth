package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Professor;

public interface ProfessorRepositorio extends CrudRepository<Professor,Integer>{
    String Inscreveraula= ("insert into aulas (Au_Nome, Au_Tempo, Au_Local, Au_Tipo,Au_Data)"
    + " values (String Nome,int Tempo,String Local, String Tipo,String Data)"); 

    @Query(value=Inscreveraula ,nativeQuery = true)
    Iterable<Professor> Inscreveraula();

}