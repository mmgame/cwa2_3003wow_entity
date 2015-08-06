package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchEntity extends MatchGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	
	private Map<String,Integer> battleKeyIdsMap = new HashMap<String,Integer>();
	private Map<String,Integer> resetKeyIdsMap = new HashMap<String,Integer>();

	@Override
	public void obtainAfter() {
	    battleKeyIdsMap = JsonUtil.transferJsonTOJavaBean(this.battleKeyIds, Map.class);
	    resetKeyIdsMap = JsonUtil.transferJsonTOJavaBean(this.resetKeyIds, Map.class);
	}

	@Override
	public void saveBefore() {
		this.battleKeyIds = JsonUtil.gsonObj2String(battleKeyIdsMap);
		this.resetKeyIds = JsonUtil.gsonObj2String(resetKeyIdsMap);
	}

	@Override
	public void saveAfter() {
	}

	public Map<String,Integer> getBattleKeyIdsMap(){
		return battleKeyIdsMap;
	}
	public Map<String,Integer> getResetKeyIdsMap(){
		return resetKeyIdsMap;
	}

	public void setBattleKeyIdsMap(Map<String,Integer> battleKeyIdsMap){
		this.battleKeyIdsMap = battleKeyIdsMap;
	}
	public void setResetKeyIdsMap(Map<String,Integer> resetKeyIdsMap){
		this.resetKeyIdsMap = resetKeyIdsMap;
	}
	public MatchEntity cloneEntity() {
		MatchEntity entity = new MatchEntity();
		entity.userId = this.userId;
		entity.matchType = this.matchType;
		entity.matchKeyId = this.matchKeyId;
		entity.battleKeyIds = this.battleKeyIds;
		entity.resetKeyIds = this.resetKeyIds;
		entity.resetTime = this.resetTime;
		return entity;
	}
}
