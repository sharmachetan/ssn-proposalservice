package com.srn.common.pojo;

import com.srn.common.db.models.DocDescription;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Document
public class DocumentPojo {
    @Id
    String id;
    String title;
    String owner;
    ArrayList<String> contributors;
    ArrayList<String> supervisors;
    DocDescription desc;

}
