package com.aneelap.reportingtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneelap.reportingtool.entity.ReportingSchema;
import com.aneelap.reportingtool.repository.ReportingSchemaRepository;

@RequestMapping("/admin/schema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SchemaController {
	
	@Autowired
	ReportingSchemaRepository schemaRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<ReportingSchema>> getSchema() {
		List<ReportingSchema> schemaList = schemaRepository.findAll();
		return ResponseEntity.ok(schemaList);
	}

}
