package com.sopromadze.blogapi.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class ReportRequest {
    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Size(min = 10 , max = 12)
    private String phone;

    @NotBlank
    private Date date;

    @NotBlank
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

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
