package com.lstguardleft.discipline_backend.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@Entity
@Table(name="code_list")
public class CodeEntity {
    @Id
    @Column(length=16, nullable=false)
    private String code;

    @Column(length=100, nullable=false)
    private String codeName;

    @Column(length=20, nullable=false)
    private String codeDesc;

    @Column(length=1, nullable=false)
    private char useYN;
}
