package com.srn.common.db.repository;

import com.srn.common.db.models.DocDescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalDescRepository extends MongoRepository<DocDescription,String> {




}
