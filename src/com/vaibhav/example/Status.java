package com.vaibhav.example;

public enum Status {
    NOT_STARTED("Site Sale Sku generation has not begun yet"),
    QUERYING("Querying EDW for SKU information"),
    TRANSFERRING("Transferring data to B2C"),
    DONE("Done");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String status(){
        return status;
    }
}