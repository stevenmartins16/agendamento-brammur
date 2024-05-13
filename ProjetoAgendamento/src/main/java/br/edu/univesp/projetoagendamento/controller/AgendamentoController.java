package br.edu.univesp.projetoagendamento.controller;

import br.edu.univesp.projetoagendamento.entity.Agendamento;
import br.edu.univesp.projetoagendamento.service.agendamento.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@Controller
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/index")
    public String index(Model model) {
        Agendamento agendamento = new Agendamento();
        model.addAttribute("agendamento", agendamento);
        return "index";
    }

    @PostMapping("/agendar")
    public String salvarAgendamento(@ModelAttribute("agendamento") Agendamento agendamento, Model model) {
        agendamentoService.salvarAgendamento(agendamento);
        model.addAttribute("agendamento", agendamento);
        return "register_success";
    }

    // Endpoint para retornar os agendamentos já feitos
    @GetMapping("/agendados")
    public String agendados(Model model){
        List<Agendamento> agendamentos = agendamentoService.getAgendamentosAgendados();
        agendamentos.sort(Comparator.comparing(Agendamento::getDiaEHora).reversed());
        model.addAttribute("agendamentos", agendamentos);
        return "agendados";
    }


}
