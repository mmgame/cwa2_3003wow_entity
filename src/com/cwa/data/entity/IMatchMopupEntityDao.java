package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.MatchMopupEntity;

public interface IMatchMopupEntityDao extends IEntityDao<MatchMopupEntity> {
	
	public MatchMopupEntity selectEntityByUserId(long userId,Object attach);
}
