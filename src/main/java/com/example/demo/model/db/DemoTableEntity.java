package com.example.demo.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DEMO_TABLE")
public class DemoTableEntity implements Serializable {

    private static final long serialVersionUID = -8627961L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OID")
    private Integer oid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TEL")
    private String tel;
}
