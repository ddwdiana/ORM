package com.unitbv.dao;

import javax.ejb.Remote;

import com.unitbv.dto.UserDetailsDTO;

@Remote
public interface UserDAORemote extends BaseDAORemote<UserDetailsDTO>{
 void update(UserDetailsDTO entry, int id);

}
