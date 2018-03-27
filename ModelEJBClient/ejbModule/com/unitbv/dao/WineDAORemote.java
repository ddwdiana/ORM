package com.unitbv.dao;

import javax.ejb.Remote;

import com.unitbv.dto.WineDTO;

@Remote
public interface WineDAORemote extends BaseDAORemote<WineDTO>{

}
