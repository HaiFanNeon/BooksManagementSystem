package com.example.booksmanagementsystem.model;


import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private int total;
    private List<T> records;
    PageRequest pageRequest;
    public PageResult(int total, List<T> records, PageRequest pageRequest) {
        this.total = total;
        this.records = records;
        this.pageRequest = pageRequest;
    }
}
