package com.example.overseasshopping.Model;

public class User {

    private int userNo;
    private String username;
    private String password;
    private String telephone;
    private String address;
    private int rating;
    private int totalRatedBy;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getTotalRatedBy() {
        return totalRatedBy;
    }

    public void setTotalRatedBy(int totalRatedBy) {
        this.totalRatedBy = totalRatedBy;
    }

}