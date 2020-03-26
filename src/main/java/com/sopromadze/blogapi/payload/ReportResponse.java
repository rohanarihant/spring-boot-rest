package com.sopromadze.blogapi.payload;


import java.util.Date;

public class ReportResponse {
    private String name;
    private String phone;
    private Date date;
    private String duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String time) {
        this.duration = time;
    }
}
