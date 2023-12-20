package com.lstguardleft.discipline_backend.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

import com.lstguardleft.discipline_backend.common.entity.idclass.CodeDetailPk;

@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@Entity
@Table(name="code_detail")
@IdClass(CodeDetailPk.class)
public class CodeDetailEntity {
    @Id
    @Column(length=16, nullable=false)
    private String codeId;

    @Id
    @Column(length=16, nullable=false)
    private String subCode;

    @Column(length=100, nullable=false)
    private String Value;

    @Column(length=20, nullable=false)
    private BigInteger sortSeq;
}
