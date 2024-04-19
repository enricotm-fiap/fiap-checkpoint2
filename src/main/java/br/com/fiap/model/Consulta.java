package br.com.fiap.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long> {
	
	enum Status {
		AGENDADA,
		CANCELADA,
		REALIZADA
	}

	@ManyToOne
	@JoinColumn(nullable = false, name = "profissional_id")
	private Paciente profissional;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "paciente_id")
	private Paciente paciente;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDateTime data_consulta;
	
	@Column(nullable = false)
	private Status status_consulta;
	
	@Column()
	private double quantidade_horas;
	
	@Column()
	private double valor_consulta;
	
}
