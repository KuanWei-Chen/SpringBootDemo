package com.example.demo.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class DemoTableDTO implements Serializable {
    private Integer oid;

    private String name;

    private String tel;
}
