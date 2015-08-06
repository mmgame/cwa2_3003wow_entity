package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.UsereconomyGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class UsereconomyEntity extends UsereconomyGeneralEntity implements ISpreadEntity {
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


	public UsereconomyEntity cloneEntity() {
		UsereconomyEntity entity = new UsereconomyEntity();
		entity.userId = this.userId;
		entity.moneyType = this.moneyType;
		entity.moneyCount = this.moneyCount;
		return entity;
	}
}
