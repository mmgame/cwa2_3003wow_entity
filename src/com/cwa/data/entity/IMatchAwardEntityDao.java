package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchAwardEntity;

public interface IMatchAwardEntityDao extends IEntityDao<MatchAwardEntity> {
	
	public MatchAwardEntity selectEntityByUserIdAndChapterId(long userId,int chapterId,Object attach);
	public List<MatchAwardEntity> selectEntityByUserId(long userId,Object attach) ;
}
