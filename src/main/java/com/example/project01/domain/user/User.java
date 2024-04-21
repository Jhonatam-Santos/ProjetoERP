package com.example.project01.domain.user;

import com.example.project01.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tb_entidade")
@Entity(name = "User")
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(cpf_cnpj = "cpf_cnpj", nullable = false, unique = true)
    private String cpf_cnpj;
    @Column(in_ativo = "in_ativo", nullable = false)
    private String in_ativo;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.cpf_cnpj = userDto.getCpf_cnpj();
        this.in_ativo = userDto.getIn_ativo();
        this.email = userDto.getEmail();
    }
}
