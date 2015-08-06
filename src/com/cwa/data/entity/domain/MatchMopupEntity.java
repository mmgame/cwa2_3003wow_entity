package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchMopupGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchMopupEntity extends MatchMopupGeneralEntity implements ISpreadEntity {
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


	public MatchMopupEntity cloneEntity() {
		MatchMopupEntity entity = new MatchMopupEntity();
		entity.userId = this.userId;
		entity.mopupCount = this.mopupCount;
		entity.resetTime = this.resetTime;
		return entity;
	}
}
