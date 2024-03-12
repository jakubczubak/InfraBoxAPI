package com.example.infraboxapi.project;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectDTO {
    private Integer id;
    @NotBlank(message = "Field 'project name' cannot be blank")
    @Size(min = 2, max = 100, message = "Field 'project name' must have a length between 2 and 100 characters")
    private String name;
    private String status;
}
