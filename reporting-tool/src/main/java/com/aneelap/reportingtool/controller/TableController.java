package com.aneelap.reportingtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneelap.reportingtool.entity.ReportingTable;
import com.aneelap.reportingtool.repository.ReportingTableRepository;

@RequestMapping("/admin/table")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TableController {
	
	@Autowired
	ReportingTableRepository tableRepository;
	
	@GetMapping("/{schemaId}")
	public ResponseEntity<List<ReportingTable>> getSchema(@PathVariable Long schemaId) {
		List<ReportingTable> tableList = tableRepository.findBySchemaId(schemaId);
		return ResponseEntity.ok(tableList);
	}
}
