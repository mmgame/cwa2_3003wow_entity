package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchEntity;

public interface IMatchEntityDao extends IEntityDao<MatchEntity> {
	
	public MatchEntity selectEntityByUserIdAndMatchType(long userId,int matchType,Object attach);
	public List<MatchEntity> selectEntityByUserId(long userId,Object attach) ;
}
