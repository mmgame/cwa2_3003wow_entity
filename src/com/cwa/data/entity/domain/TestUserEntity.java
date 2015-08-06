package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.TestUserGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class TestUserEntity extends TestUserGeneralEntity implements ISpreadEntity {
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


	public TestUserEntity cloneEntity() {
		TestUserEntity entity = new TestUserEntity();
		entity.userId = this.userId;
		entity.level = this.level;
		entity.name = this.name;
		entity.exp = this.exp;
		return entity;
	}
}
