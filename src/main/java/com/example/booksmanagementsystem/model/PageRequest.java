package com.example.booksmanagementsystem.model;


import lombok.Data;

@Data
public class PageRequest {
    private Integer currentPage = 1;
    private Integer pageSize = 10;


    public Integer getOffset() {
        return (currentPage - 1) * pageSize;
    }
}
