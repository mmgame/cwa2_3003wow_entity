package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.VipGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class VipEntity extends VipGeneralEntity implements ISpreadEntity {
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


	public VipEntity cloneEntity() {
		VipEntity entity = new VipEntity();
		entity.userId = this.userId;
		entity.vipLevel = this.vipLevel;
		entity.vipExp = this.vipExp;
		entity.rewardState = this.rewardState;
		return entity;
	}
}
