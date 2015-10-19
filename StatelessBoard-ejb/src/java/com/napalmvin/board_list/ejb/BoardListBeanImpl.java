/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.napalmvin.board_list.ejb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author lol
 */
@Stateless(name ="BoardList" )
public class BoardListBeanImpl implements BoardListBean{

    @Override
    public List<BoardRecord> getList() {
        List<BoardRecord> list=new ArrayList<>();
        list.add(new BoardRecord(0L,"Zero item"));
        list.add(new BoardRecord(1L,"One item"));
        list.add(new BoardRecord(2L,"Two item"));
        return list;
    }
    
    
    
}
