package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchShopEntity;

public interface IMatchShopEntityDao extends IEntityDao<MatchShopEntity> {
	
	public MatchShopEntity selectEntityByUserIdAndShopType(long userId,int shopType,Object attach);
	public List<MatchShopEntity> selectEntityByUserId(long userId,Object attach) ;
}
