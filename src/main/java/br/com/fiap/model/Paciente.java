package br.com.fiap.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 60)
	private String nome;
	
	@Column(length = 80)
	private String endereço;
	
	@Column(length = 40)
	private String bairro;
	
	@Column(length = 30)
	private String email;
	
	@Column(length = 100)
	private String telefone_completo;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate data_nascimento;
	
	@Column(nullable = false, updatable = false, columnDefinition = "DATE")
    private LocalDateTime created_at;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDateTime updated_at;
	
//    INSERT INTO pacientes (nome, endereço, bairro, email, telefone_completo, data_nascimento)
//    values ('Felipe', 'Rua dos Gansos', 'Moema', 'felipe@email.com', '94567-0987', '2002-07-18');

}
