/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.napalmvin.board_list.ejb;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lol
 */

@Local
public interface BoardListBean {
    public List<BoardRecord> getList();
}
