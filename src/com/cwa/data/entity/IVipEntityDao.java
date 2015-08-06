package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.VipEntity;

public interface IVipEntityDao extends IEntityDao<VipEntity> {
	
	public VipEntity selectEntityByUserId(long userId,Object attach);
}
