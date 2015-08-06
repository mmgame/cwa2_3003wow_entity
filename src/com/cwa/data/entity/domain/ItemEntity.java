package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.ItemGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class ItemEntity extends ItemGeneralEntity implements ISpreadEntity {
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


	public ItemEntity cloneEntity() {
		ItemEntity entity = new ItemEntity();
		entity.userId = this.userId;
		entity.itemId = this.itemId;
		entity.count = this.count;
		return entity;
	}
}
