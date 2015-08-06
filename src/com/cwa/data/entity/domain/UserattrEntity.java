package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.UserattrGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class UserattrEntity extends UserattrGeneralEntity implements ISpreadEntity {
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


	public UserattrEntity cloneEntity() {
		UserattrEntity entity = new UserattrEntity();
		entity.userId = this.userId;
		entity.attrType = this.attrType;
		entity.attrValue = this.attrValue;
		return entity;
	}
}
