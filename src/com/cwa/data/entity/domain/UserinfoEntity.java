package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.UserinfoGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class UserinfoEntity extends UserinfoGeneralEntity implements ISpreadEntity {
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


	public UserinfoEntity cloneEntity() {
		UserinfoEntity entity = new UserinfoEntity();
		entity.userId = this.userId;
		entity.name = this.name;
		entity.level = this.level;
		entity.experience = this.experience;
		entity.icon = this.icon;
		entity.modifyNameCount = this.modifyNameCount;
		entity.power = this.power;
		entity.buyCount = this.buyCount;
		entity.resetTime = this.resetTime;
		entity.eventState = this.eventState;
		entity.functionState = this.functionState;
		return entity;
	}
}
