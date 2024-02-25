package com.aneelap.reportingtool.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "reporting_table") 
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"columns", "schema"})
public class ReportingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schema_id")
    @JsonIgnore
    private ReportingSchema schema;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "label", length = 50)
    private String label;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "active")
    private boolean active;

    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ReportingColumn> columns;
}
