package br.edu.univesp.projetoagendamento.service.agendamento;

import br.edu.univesp.projetoagendamento.entity.Agendamento;
import br.edu.univesp.projetoagendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento salvarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> getAgendamentosAgendados() {
        return agendamentoRepository.findAll();
    }
}
