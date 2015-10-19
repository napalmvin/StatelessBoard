/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.napalmvin.board_list.ejb;

/**
 *
 * @author lol
 */
public class BoardRecord {
    private Long id;
    private String description;
    private BoardRecord() {}

    public BoardRecord(Long id, String description) {
        this.id = id;
        this.description = description;
    }
    
    

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
