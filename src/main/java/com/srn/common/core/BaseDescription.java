package com.srn.common.core;

/*
 *  Author      :chetansharma
 *  CreatedOn   : 2020-02-20
 *  Description : An abstract class used to facilitate iplementaton of Description section
 *
 * */
public abstract class BaseDescription {

    // This Variable contains the overall description written under
    // Description column
    private String value;

    protected void fetchLatestFormVersion(){

    }
    public  void findFormByVersionId(){};
    public  void updateForm(){};
    public  void deleteForm(){
        this.run("happyNow");
    };
    public  abstract  void run(String value);


    /*
    * used to initiate the process of content extraction from
    *
    * */
    public void init(){

    }

}
