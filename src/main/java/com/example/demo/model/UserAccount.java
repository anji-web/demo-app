package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String history;
    private Long bank_account;
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Long getBank_account() {
        return bank_account;
    }

    public void setBank_account(Long bank_account) {
        this.bank_account = bank_account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
