package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Professor;

public interface ProfessorRepositorio extends CrudRepository<Professor,Integer>{

    String Inscreveraula= ("insert into aulas (Au_nome,Au_Tempo,Au_Local,Au_Tipo,Au_Data)"
    + " values (:auNome,:auTempo,:auLocal,:auTipo,:auData)"); // inscreve nova aula

    @Modifying @Transactional
    @Query(value=Inscreveraula ,nativeQuery = true)
    Iterable<Professor> Inscreveraula(@Param("auNome") String AuNome,@Param("auTempo") int auTempo,@Param("auLocal") String auLocal,@Param("auTipo") String auTipo,
                                    @Param("auData") String auData);
}