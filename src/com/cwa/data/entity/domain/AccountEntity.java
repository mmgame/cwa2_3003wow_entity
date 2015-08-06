package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.AccountGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class AccountEntity extends AccountGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	
	private Map<String,List<Long>> ridsMap = new HashMap<String,List<Long>>();

	@Override
	public void obtainAfter() {
	    ridsMap = JsonUtil.transferJsonTOJavaBean(this.rids, Map.class);
	}

	@Override
	public void saveBefore() {
		this.rids = JsonUtil.gsonObj2String(ridsMap);
	}

	@Override
	public void saveAfter() {
	}

	public Map<String,List<Long>> getRidsMap(){
		return ridsMap;
	}

	public void setRidsMap(Map<String,List<Long>> ridsMap){
		this.ridsMap = ridsMap;
	}
	public AccountEntity cloneEntity() {
		AccountEntity entity = new AccountEntity();
		entity.accountId = this.accountId;
		entity.account = this.account;
		entity.channel = this.channel;
		entity.password = this.password;
		entity.createTime = this.createTime;
		entity.rids = this.rids;
		return entity;
	}
}
