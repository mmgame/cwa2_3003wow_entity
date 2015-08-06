package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.AccountEntity;

public interface IAccountEntityDao extends IEntityDao<AccountEntity> {
	
	public AccountEntity selectEntityByAccountId(long accountId,Object attach);
	public AccountEntity selectEntityByAccountAndChannel(String account,int channel,Object attach);
}
