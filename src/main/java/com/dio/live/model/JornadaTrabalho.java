package com.dio.live.model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@EnableJpaAuditing
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private JornadaTrabalho jornadaTrabalho;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
        return jornadaTrabalho;
    }
}



