package com.aneelap.reportingtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneelap.reportingtool.entity.ReportingTable;

@Repository
public interface ReportingTableRepository extends JpaRepository<ReportingTable, Long> {

	List<ReportingTable> findBySchemaId(Long schemaId);
    // You can add custom query methods here if needed
}
