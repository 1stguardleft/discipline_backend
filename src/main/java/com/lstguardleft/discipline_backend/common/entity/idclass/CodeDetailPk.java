package com.lstguardleft.discipline_backend.common.entity.idclass;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Builder
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
public class CodeDetailPk implements Serializable {
    private String codeId;
    private String subCode;
}
