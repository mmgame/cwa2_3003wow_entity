package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.FormationGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class FormationEntity extends FormationGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	
	private List<Integer> herosList = new ArrayList<Integer>();
	private List<Integer> retinuesList = new ArrayList<Integer>();

	@Override
	public void obtainAfter() {
	    herosList = JsonUtil.transferJsonTOJavaBean(this.heros, List.class);
	    retinuesList = JsonUtil.transferJsonTOJavaBean(this.retinues, List.class);
	}

	@Override
	public void saveBefore() {
		this.heros = JsonUtil.gsonObj2String(herosList);
		this.retinues = JsonUtil.gsonObj2String(retinuesList);
	}

	@Override
	public void saveAfter() {
	}

	public List<Integer> getHerosList(){
		return herosList;
	}
	public List<Integer> getRetinuesList(){
		return retinuesList;
	}

	public void setHerosList(List<Integer> herosList){
		this.herosList = herosList;
	}
	public void setRetinuesList(List<Integer> retinuesList){
		this.retinuesList = retinuesList;
	}
	public FormationEntity cloneEntity() {
		FormationEntity entity = new FormationEntity();
		entity.userId = this.userId;
		entity.type = this.type;
		entity.heros = this.heros;
		entity.retinues = this.retinues;
		return entity;
	}
}
