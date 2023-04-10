package com.banco.union.repository;

import java.util.List;

import com.banco.union.models.dto.CaoUsuarioDto;
import feign.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.union.models.entity.CaoUsuario;
import com.banco.union.models.entity.CaoUsuarioPk;

@Repository
public interface ICaoUsuarioRepository extends CrudRepository<CaoUsuario, CaoUsuarioPk>{
	
	@Query(value = " SELECT cau.no_usuario FROM caol.cao_usuario cau " +
			" CROSS JOIN caol.permissao_sistema ps ON cau.co_usuario = ps.co_usuario " +
			" WHERE ps.co_sistema = :coSistema AND ps.in_ativo = :inActivo AND ps.co_tipo_usuario IN (:coTipoUsuarios) ", nativeQuery = true)
	List<CaoUsuarioDto> getCaoUsuarioDto(@Param("coSistema") Integer coSistema, @Param("inActivo") char inActivo, @Param("coTipoUsuarios") List<Integer> coTipoUsuarios);
}