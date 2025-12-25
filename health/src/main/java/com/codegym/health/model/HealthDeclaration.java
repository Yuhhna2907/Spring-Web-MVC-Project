package com.codegym.health.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class HealthDeclaration {

    @NotBlank(message = "Họ tên không được để trống")
    private String fullName;

    @NotNull(message = "Năm sinh bắt buộc")
    private Integer yearOfBirth;

    @NotBlank(message = "Giới tính bắt buộc")
    private String gender;

    @NotBlank(message = "Quốc tịch bắt buộc")
    private String nationality;

    @NotBlank(message = "Số giấy tờ bắt buộc")
    private String identity;

    @NotBlank(message = "Địa chỉ liên lạc bắt buộc")
    private String address;

    @NotBlank(message = "Số điện thoại bắt buộc")
    private String phone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
