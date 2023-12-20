package com.lstguardleft.discipline_backend.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstguardleft.discipline_backend.common.entity.CodeDetailEntity;
import com.lstguardleft.discipline_backend.common.entity.idclass.CodeDetailPk;

public interface CodeDetailRepository extends JpaRepository<CodeDetailEntity, CodeDetailPk> {
    public List<CodeDetailEntity> findByCodeIdOrderBySortSeq(String codeId);
}
