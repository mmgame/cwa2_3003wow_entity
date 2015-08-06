package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.UsereconomyEntity;

public interface IUsereconomyEntityDao extends IEntityDao<UsereconomyEntity> {
	
	public UsereconomyEntity selectEntityByUserIdAndMoneyType(long userId,int moneyType,Object attach);
	public List<UsereconomyEntity> selectEntityByUserId(long userId,Object attach) ;
}
