package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchShopGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchShopEntity extends MatchShopGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;
	
	private List<Integer> goodsIndexList = new ArrayList<Integer>();

	@Override
	public void obtainAfter() {
	    goodsIndexList = JsonUtil.transferJsonTOJavaBean(this.goodsIndex, List.class);
	}

	@Override
	public void saveBefore() {
		this.goodsIndex = JsonUtil.gsonObj2String(goodsIndexList);
	}

	@Override
	public void saveAfter() {
	}

	public List<Integer> getGoodsIndexList(){
		return goodsIndexList;
	}

	public void setGoodsIndexList(List<Integer> goodsIndexList){
		this.goodsIndexList = goodsIndexList;
	}
	public MatchShopEntity cloneEntity() {
		MatchShopEntity entity = new MatchShopEntity();
		entity.userId = this.userId;
		entity.shopType = this.shopType;
		entity.shopId = this.shopId;
		entity.resetTime = this.resetTime;
		entity.goodsIndex = this.goodsIndex;
		entity.refreshCount = this.refreshCount;
		return entity;
	}
}
