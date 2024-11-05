package com.example.teamcity.api.models;

import com.example.teamcity.api.annotations.Random;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewProjectDescription extends BaseModel {
    private String id;
    @Random
    private String name;
    private Project parentProject;
}
