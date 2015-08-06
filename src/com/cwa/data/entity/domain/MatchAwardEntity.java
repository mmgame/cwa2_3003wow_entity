package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchAwardGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchAwardEntity extends MatchAwardGeneralEntity implements ISpreadEntity {
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


	public MatchAwardEntity cloneEntity() {
		MatchAwardEntity entity = new MatchAwardEntity();
		entity.userId = this.userId;
		entity.chapterId = this.chapterId;
		entity.awardStates = this.awardStates;
		return entity;
	}
}
