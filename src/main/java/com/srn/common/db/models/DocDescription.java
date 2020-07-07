package com.srn.common.db.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(value="description")
@Component
@Getter
@Setter
public class DocDescription {
    @Id
    String id;
    String content;
}
