package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchConcealGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchConcealEntity extends MatchConcealGeneralEntity implements ISpreadEntity {
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


	public MatchConcealEntity cloneEntity() {
		MatchConcealEntity entity = new MatchConcealEntity();
		entity.userId = this.userId;
		entity.concealId = this.concealId;
		entity.resetTime = this.resetTime;
		return entity;
	}
}
