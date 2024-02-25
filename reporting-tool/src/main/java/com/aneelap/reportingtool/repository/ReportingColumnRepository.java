package com.aneelap.reportingtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneelap.reportingtool.entity.ReportingColumn;

@Repository
public interface ReportingColumnRepository extends JpaRepository<ReportingColumn, Long> {

	List<ReportingColumn> findByTableId(Long tableId);
    // You can add custom query methods here if needed
}
