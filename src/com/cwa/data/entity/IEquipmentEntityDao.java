package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.EquipmentEntity;

public interface IEquipmentEntityDao extends IEntityDao<EquipmentEntity> {
	
	public EquipmentEntity selectEntityByUserIdAndHeroIdAndPositionId(long userId,int heroId,int positionId,Object attach);
	public List<EquipmentEntity> selectEntityByUserIdAndHeroId(long userId,int heroId,Object attach) ;
	public List<EquipmentEntity> selectEntityByUserId(long userId,Object attach) ;
}
