package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.FormationEntity;

public interface IFormationEntityDao extends IEntityDao<FormationEntity> {
	
	public FormationEntity selectEntityByUserIdAndType(long userId,int type,Object attach);
	public List<FormationEntity> selectEntityByUserId(long userId,Object attach) ;
}
