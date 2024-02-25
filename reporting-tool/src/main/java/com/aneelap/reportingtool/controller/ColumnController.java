package com.aneelap.reportingtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneelap.reportingtool.entity.ReportingColumn;
import com.aneelap.reportingtool.repository.ReportingColumnRepository;

@RequestMapping("/admin/column")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ColumnController {
	
	@Autowired
	ReportingColumnRepository columnRepository;
	
	@GetMapping("/{tableId}")
	public ResponseEntity<List<ReportingColumn>> getSchema(@PathVariable Long tableId) {
		List<ReportingColumn> columnList = columnRepository.findByTableId(tableId);
		return ResponseEntity.ok(columnList);
	}
}
