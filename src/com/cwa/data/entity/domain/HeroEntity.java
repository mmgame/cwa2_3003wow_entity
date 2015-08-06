package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.HeroGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class HeroEntity extends HeroGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	
	private List<Integer> patienceTrainList = new ArrayList<Integer>();
	private List<Integer> waitPatienceTrainList = new ArrayList<Integer>();

	@Override
	public void obtainAfter() {
	    patienceTrainList = JsonUtil.transferJsonTOJavaBean(this.patienceTrain, List.class);
	    waitPatienceTrainList = JsonUtil.transferJsonTOJavaBean(this.waitPatienceTrain, List.class);
	}

	@Override
	public void saveBefore() {
		this.patienceTrain = JsonUtil.gsonObj2String(patienceTrainList);
		this.waitPatienceTrain = JsonUtil.gsonObj2String(waitPatienceTrainList);
	}

	@Override
	public void saveAfter() {
	}

	public List<Integer> getPatienceTrainList(){
		return patienceTrainList;
	}
	public List<Integer> getWaitPatienceTrainList(){
		return waitPatienceTrainList;
	}

	public void setPatienceTrainList(List<Integer> patienceTrainList){
		this.patienceTrainList = patienceTrainList;
	}
	public void setWaitPatienceTrainList(List<Integer> waitPatienceTrainList){
		this.waitPatienceTrainList = waitPatienceTrainList;
	}
	public HeroEntity cloneEntity() {
		HeroEntity entity = new HeroEntity();
		entity.userId = this.userId;
		entity.heroId = this.heroId;
		entity.level = this.level;
		entity.experience = this.experience;
		entity.starLevel = this.starLevel;
		entity.quality = this.quality;
		entity.patienceTrain = this.patienceTrain;
		entity.trainState = this.trainState;
		entity.waitPatienceTrain = this.waitPatienceTrain;
		entity.trainType = this.trainType;
		return entity;
	}
}
