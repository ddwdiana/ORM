package com.unitbv.dao;

import javax.ejb.Remote;

import com.unitbv.dto.OrderItemDTO;

@Remote
public interface OrderItemDAORemote extends BaseDAORemote<OrderItemDTO>{

}
