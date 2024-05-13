package br.edu.univesp.projetoagendamento.repository;

import br.edu.univesp.projetoagendamento.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}

