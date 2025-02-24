//package com.example.AdrianPeiro.Model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//import java.util.Set;
//
//@Entity
//@Table
//public class User {
//    @Id
//    private String username;
//    private String password;
//    private boolean enable;
//
//    @OneToMany(mappedBy ="username")
//    private Set<Authority> authorities;
//
//    public User() {
//    }
//
//    public User(String username, String password, boolean enable, Set<Authority> authorities) {
//        this.username = username;
//        this.password = password;
//        this.enable = enable;
//        this.authorities = authorities;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public boolean isEnable() {
//        return enable;
//    }
//
//    public void setEnable(boolean enable) {
//        this.enable = enable;
//    }
//
//    public Set<Authority> getAuthorities() {
//        return authorities;
//    }
//
//    public void setAuthorities(Set<Authority> authorities) {
//        this.authorities = authorities;
//    }
//}
//
