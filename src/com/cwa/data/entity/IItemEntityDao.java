package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.ItemEntity;

public interface IItemEntityDao extends IEntityDao<ItemEntity> {
	
	public ItemEntity selectEntityByUserIdAndItemId(long userId,int itemId,Object attach);
	public List<ItemEntity> selectEntityByUserId(long userId,Object attach) ;
}
