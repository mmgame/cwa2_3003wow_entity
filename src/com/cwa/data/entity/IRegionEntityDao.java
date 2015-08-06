package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.RegionEntity;

public interface IRegionEntityDao extends IEntityDao<RegionEntity> {
	
	public RegionEntity selectEntityByRid(int rid,Object attach);
}
