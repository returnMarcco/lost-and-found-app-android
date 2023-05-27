package com.example.lost_and_found_app_android;

import java.sql.Date;

public class LostAndFoundModel {
    private int itemId;
    private String userName;
    private int phoneNumber;
    private String itemDescription;
    private Date date;
    private String itemLocation;
    private boolean isDeleted;
    private String lostOrFound;

    public LostAndFoundModel(int itemId, String userName, int phoneNumber, String itemDescription, Date date, String itemLocation, boolean isDeleted, String lostOrFound) {
        this.itemId = itemId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.itemDescription = itemDescription;
        this.date = date;
        this.itemLocation = itemLocation;
        this.isDeleted = isDeleted;
        this.lostOrFound = lostOrFound;
    }
    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getUserName() {
        return userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public Date getDate() {
        return date;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getLostOrFound() {
        return lostOrFound;
    }

    // Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setLostOrFound(String lostOrFound) {
        this.lostOrFound = lostOrFound;
    }
}