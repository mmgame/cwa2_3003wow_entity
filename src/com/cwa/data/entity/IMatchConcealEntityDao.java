package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchConcealEntity;

public interface IMatchConcealEntityDao extends IEntityDao<MatchConcealEntity> {
	
	public MatchConcealEntity selectEntityByUserIdAndConcealId(long userId,int concealId,Object attach);
	public List<MatchConcealEntity> selectEntityByUserId(long userId,Object attach) ;
}
