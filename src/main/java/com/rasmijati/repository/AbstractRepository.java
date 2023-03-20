/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rasmijati.repository;

import com.rasmijati.model.IEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 * @param <T>
 */
public abstract class AbstractRepository<T extends IEntity> {

    private List<T> list;    // empty list

    public AbstractRepository() {
        list = new ArrayList<>();     //create list's object
    }

    public void create(T list) {
        this.list.add(list);
    }

    public List<T> findAll() {
        return list;
    }

    public T findById(Long id) {
        for (T t : list) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public void delete(T list) {
        this.list.remove(list);
    }

    public void edit(T t) {

    }
}
