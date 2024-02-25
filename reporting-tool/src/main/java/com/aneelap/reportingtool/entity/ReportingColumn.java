package com.aneelap.reportingtool.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "reporting_column") 
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "table")
public class ReportingColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "table_id")
    @JsonIgnore
    private ReportingTable table;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "label", length = 50)
    private String label;

    @Column(name = "data_type", length = 50)
    private String dataType;

    @Column(name = "active")
    private boolean active;
}
