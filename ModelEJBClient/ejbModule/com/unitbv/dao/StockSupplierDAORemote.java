package com.unitbv.dao;

import javax.ejb.Remote;

import com.unitbv.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends BaseDAORemote<StockSupplierDTO> {

}
