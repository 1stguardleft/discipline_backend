package com.lstguardleft.discipline_backend.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstguardleft.discipline_backend.common.entity.CodeDetailEntity;

public interface CodeListRepository extends JpaRepository<CodeEntity, CodeDetailPk> {
    public List<CodeEntity> findByCodeIdOrderBySortSeq(String codeId);
}
