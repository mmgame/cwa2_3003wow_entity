package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.AccountcountGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class AccountcountEntity extends AccountcountGeneralEntity implements ISpreadEntity {
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


	public AccountcountEntity cloneEntity() {
		AccountcountEntity entity = new AccountcountEntity();
		entity.aid = this.aid;
		entity.address = this.address;
		entity.count = this.count;
		entity.version = this.version;
		return entity;
	}
}
