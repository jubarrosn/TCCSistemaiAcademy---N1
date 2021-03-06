package br.com.iacademy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.iacademy.model.Empresa;

@Repository
@Transactional
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	Optional<Empresa> findById(Long empr_iden);
	//void empresa(long empr_iden, int empr_cnpj, int empr_contato, String empr_razao_soc, String empr_nome_fant,
	//		String empr_endereco);
	
}

