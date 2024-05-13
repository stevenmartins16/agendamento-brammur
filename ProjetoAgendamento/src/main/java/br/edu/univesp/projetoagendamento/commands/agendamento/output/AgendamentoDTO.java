package br.edu.univesp.projetoagendamento.commands.agendamento.output;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AgendamentoDTO {

    private String nome;
    private LocalDateTime dataDoAgendamento;

}
