package com.resttemplateapplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beer {
    private Integer id;
    private String name;
    private String description;
}
