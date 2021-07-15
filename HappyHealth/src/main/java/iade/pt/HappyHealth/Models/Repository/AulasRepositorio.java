package iade.pt.HappyHealth.Models.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import iade.pt.HappyHealth.Models.Aula;

public interface AulasRepositorio extends CrudRepository<Aula,Integer>{

    String Queryfindaula =("select Au_id,Au_nome,Au_Tempo,Au_Local,Au_Tipo,Au_Data from aulas ");

    @Query(value = Queryfindaula,nativeQuery = true)
    Iterable<Aula> findaulas();

    @Query( value = Queryfindaula + "where au_nome=:auNome ",nativeQuery = true) //filtra aulas por nome
    Iterable<Aula> Consulaulanome(@Param("auNome") String auNome);

    @Query( value = Queryfindaula + "where au_Local=:auLocal ",nativeQuery = true) //filtra aulas por local
    Iterable<Aula> ConsulaulaLocal(@Param("auLocal") String AuLocal);

    @Query( value = Queryfindaula + "where au_tipo=:auTipo ",nativeQuery = true) //filtra aulas por tipo
    Iterable<Aula> ConsulaulaTipo(@Param("auTipo") String AuTipo);
}
