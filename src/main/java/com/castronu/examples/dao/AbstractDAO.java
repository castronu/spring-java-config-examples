package com.castronu.examples.dao;

import com.castronu.examples.entity.EasyTicketEntity;

/**
 * Created by castronu on 22.04.15.
 */
public abstract class AbstractDAO {

    public void save(EasyTicketEntity entity){
        System.out.println(entity + "saved.");
    }

}
