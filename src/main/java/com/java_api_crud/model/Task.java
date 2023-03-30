
package com.java_api_crud.kaiburr.model;

        import lombok.Data;
        import lombok.NoArgsConstructor;
        import org.springframework.data.annotation.Id;
        import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tasks")
@Data
@NoArgsConstructor

public class Task {

    @Id
    private String TaskID;
    private String description;
    private int severity;
    private String assignee;
    private int storyPoint;


}
