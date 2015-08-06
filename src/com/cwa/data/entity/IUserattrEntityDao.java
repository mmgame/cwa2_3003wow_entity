package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.UserattrEntity;

public interface IUserattrEntityDao extends IEntityDao<UserattrEntity> {
	
	public UserattrEntity selectEntityByUserIdAndAttrType(long userId,int attrType,Object attach);
	public List<UserattrEntity> selectEntityByUserId(long userId,Object attach) ;
}
