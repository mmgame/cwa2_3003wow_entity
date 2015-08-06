package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchStarEntity;

public interface IMatchStarEntityDao extends IEntityDao<MatchStarEntity> {
	
	public MatchStarEntity selectEntityByUserIdAndMatchTypeAndChapterId(long userId,int matchType,int chapterId,Object attach);
	public List<MatchStarEntity> selectEntityByUserIdAndMatchType(long userId,int matchType,Object attach) ;
	public List<MatchStarEntity> selectEntityByUserId(long userId,Object attach) ;
}
