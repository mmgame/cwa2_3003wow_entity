package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.UserinfoEntity;

public interface IUserinfoEntityDao extends IEntityDao<UserinfoEntity> {
	
	public UserinfoEntity selectEntityByUserId(long userId,Object attach);
}
