package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.AccountcountEntity;

public interface IAccountcountEntityDao extends IEntityDao<AccountcountEntity> {
	
	public AccountcountEntity selectEntityByAid(int aid,Object attach);
}
