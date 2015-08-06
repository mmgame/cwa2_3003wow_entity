package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.RegionGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class RegionEntity extends RegionGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	

	@Override
	public void obtainAfter() {
	}

	@Override
	public void saveBefore() {
	}

	@Override
	public void saveAfter() {
	}


	public RegionEntity cloneEntity() {
		RegionEntity entity = new RegionEntity();
		entity.rid = this.rid;
		entity.useState = this.useState;
		entity.state = this.state;
		entity.name = this.name;
		return entity;
	}
}
