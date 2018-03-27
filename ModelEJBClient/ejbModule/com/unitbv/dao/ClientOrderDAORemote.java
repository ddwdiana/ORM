package com.unitbv.dao;

import javax.ejb.Remote;

import com.unitbv.dto.ClientOrderDTO;

@Remote
public interface ClientOrderDAORemote extends BaseDAORemote<ClientOrderDTO>{

}
