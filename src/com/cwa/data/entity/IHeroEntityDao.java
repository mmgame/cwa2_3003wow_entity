package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.HeroEntity;

public interface IHeroEntityDao extends IEntityDao<HeroEntity> {
	
	public HeroEntity selectEntityByUserIdAndHeroId(long userId,int heroId,Object attach);
	public List<HeroEntity> selectEntityByUserId(long userId,Object attach) ;
}
