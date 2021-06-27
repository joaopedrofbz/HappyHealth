package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import iade.pt.HappyHealth.Models.Professor;

public interface ProfessorRepositorio extends CrudRepository<Professor,Integer>{
    String Inscreveraula= ("insert into aulas (Au_Nome, Au_Tempo, Au_Local, Au_Tipo,Au_Data)"
    + " values (String Nome,int Tempo,String Local, String Tipo,String Data)"); 

    @Query(value=Inscreveraula ,nativeQuery = true)
    Iterable<Professor> Inscreveraula();



    @Modifying @Transactional
@Query(value="Insert into inscricoes "+
"(ins_pla_cur_id,  ins_pla_dis_id,
"+
"ins_alu_id, ins_dt_inscricao) "+
"values(:#{#planId.courseId}, :#{#planId.unitId}, "+
":studentId, :date)", nativeQuery=true)
Integer registerStudent(@Param("studentId") int studentId,
@Param("planId") PlanId planId,
@Param("date") LocalDate date);
}