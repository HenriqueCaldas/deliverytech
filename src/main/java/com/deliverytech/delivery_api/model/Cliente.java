package com.deliverytech.delivery_api.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String endereco;

    @Column(unique = true)
    private String email;

    @Builder.Default
    private Boolean ativo = true;

    @Builder.Default
    private LocalDateTime dataCriacao = LocalDateTime.now();

    // IMPLEMENTAR APENAS O MÉTODO PERSONALIZADO
    @JsonIgnore
    public void inativar() {
        this.ativo = false;
    }

    // Comentário mantido para referência futura
    /* @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos; */

    // Construtor customizado para testes
    public Cliente(Long id, String nome, String email, String telefone, String endereco, LocalDateTime dataCriacao, Boolean ativo, Object unused) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
        this.ativo = ativo;
        // O parâmetro 'unused' é ignorado
    }
}
