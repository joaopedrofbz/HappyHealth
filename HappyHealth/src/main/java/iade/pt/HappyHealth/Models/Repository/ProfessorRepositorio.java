package iade.pt.HappyHealth.Models.Repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import iade.pt.HappyHealth.Models.Professor;



public interface ProfessorRepositorio extends CrudRepository<Professor, Long>{

    String Inscreveraula= ("insert into aulas (Au_nome,Au_Tempo,Au_Local,Au_Tipo,Au_Data)"
    + " values (:auNome,:auTempo,:auLocal,:auTipo,:auData)"); // inscreve nova aula

    @Modifying @Transactional
    @Query(value=Inscreveraula ,nativeQuery = true)
    int Inscreveraula(@Param("auNome") String AuNome,@Param("auTempo") int auTempo,@Param("auLocal") String auLocal,@Param("auTipo") String auTipo,
                                    @Param("auData") String auData);

    Optional<Professor> findById(int id);

    String Queryfindprof =("select prof_id,prof_NomeProp,prof_Apelido,prof_genero,prof_datanasc,prof_nif from professor ");

    @Query(value = Queryfindprof,nativeQuery = true)
    Iterable<Professor> findprof();

    @Query( value = Queryfindprof + "where prof_genero=:genero ",nativeQuery = true) //filtra prof por genero
    Iterable<Professor> Consulprofgenero(@Param("genero") char genero);

}