package br.com.fiap.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "profissionais")
public class Profissional extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = false)
	private String especialidade;
	
	@Column(columnDefinition = "NUMBER(7,2)")
	private double valor_hora;
	
	@Column(nullable = false, updatable = false, columnDefinition = "DATE")
    private LocalDateTime created_at;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDateTime updated_at;

}
