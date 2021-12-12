package com.techelevator.model;


import java.util.List;

public class Collection {

    private Long collectionId;
    private String collectionName;
    private long userId;


    public Collection() {}

    public Collection(long collectionId, String collectionName, long userId) {
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.userId = userId;
    }


    public long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(long collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collectionId=" + collectionId +
                ", collectionName='" + collectionName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
