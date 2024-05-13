package br.edu.univesp.projetoagendamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModalidadeController {

    @GetMapping("/escolher-modalidade")
    public String escolherModalidade() {
        return "escolher_modalidade";
    }

    @PostMapping("/escolher-modalidade")
    public String processarEscolhaModalidade(@RequestParam("modalidade") String modalidade, Model model) {
        model.addAttribute("modalidadeEscolhida", modalidade);
        return "confirmacao_modalidade";
    }
}
