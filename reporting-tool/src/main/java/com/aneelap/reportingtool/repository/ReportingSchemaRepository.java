package com.aneelap.reportingtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneelap.reportingtool.entity.ReportingSchema;

@Repository
public interface ReportingSchemaRepository extends JpaRepository<ReportingSchema, Long> {
    // You can add custom query methods here if needed
}
