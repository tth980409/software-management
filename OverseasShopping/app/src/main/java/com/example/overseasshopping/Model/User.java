package com.example.overseasshopping.Model;

import java.util.Date;

public class User {

    private int userNo;
    private String username;
    private String password;
    private String telephone;
    private String address;
    private Integer creditCardNo;
    private Integer securityNo;
    private Date expiryDate;

    private int rating;
    private int totalRatedBy;

    public User() {

    }


    public User(String username, String password, String telephone, String address, Integer creditCardNo, Integer securityNo, Date expiryDate) {
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.address = address;
        this.creditCardNo = creditCardNo;
        this.securityNo = securityNo;
        this.expiryDate = expiryDate;
    }

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

    public Integer getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(Integer creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public Integer getSecurityNo() {
        return securityNo;
    }

    public void setSecurityNo(Integer securityNo) {
        this.securityNo = securityNo;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
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
