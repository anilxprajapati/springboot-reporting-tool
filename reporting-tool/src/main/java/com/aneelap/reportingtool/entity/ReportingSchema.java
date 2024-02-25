package com.aneelap.reportingtool.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "reporting_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "tables")
public class ReportingSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "label", length = 50)
    private String label;

    @OneToMany(mappedBy = "schema", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ReportingTable> tables;
}