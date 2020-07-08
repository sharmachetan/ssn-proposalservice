package com.srn.common.dao;

import org.json.JSONObject;

public interface MongoActionInterface {

    public void createCollection(JSONObject collectionName);
    public void createDocument();
    public void insertValue();
}
