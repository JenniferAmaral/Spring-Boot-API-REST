package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {

	private long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime DataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.DataCriacao = topico.getDataCriacao();
	}
	
	public long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return DataCriacao;
	}

	public static List<TopicoDto> converter(List<Topico> topicos) {
		// API de stream do Java8
		//Mapeamento de topico para topicoDto e por fim transforma o mapeamento numa lista
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	
	
}
