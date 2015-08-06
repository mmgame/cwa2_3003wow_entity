package com.cwa.data.entity.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import wow.data.entity.MatchStarGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.util.prototype.JsonUtil;

public class MatchStarEntity extends MatchStarGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;

	private Map<String, Integer> chapterStarsMap = new HashMap<String, Integer>();
	private Map<String, Integer> chapterScoresMap = new HashMap<String, Integer>();

	@Override
	public void obtainAfter() {
		chapterStarsMap = JsonUtil.transferJsonTOJavaBean(this.chapterStars, Map.class);
		chapterScoresMap = JsonUtil.transferJsonTOJavaBean(this.chapterScores, Map.class);
	}

	@Override
	public void saveBefore() {
		this.chapterStars = JsonUtil.gsonObj2String(chapterStarsMap);
		this.chapterScores = JsonUtil.gsonObj2String(chapterScoresMap);
	}

	@Override
	public void saveAfter() {
	}

	public Map<String, Integer> getChapterStarsMap() {
		return chapterStarsMap;
	}

	public Map<String, Integer> getChapterScoresMap() {
		return chapterScoresMap;
	}

	public void setChapterStarsMap(Map<String, Integer> chapterStarsMap) {
		this.chapterStarsMap = chapterStarsMap;
	}

	public void setChapterScoresMap(Map<String, Integer> chapterScoresMap) {
		this.chapterScoresMap = chapterScoresMap;
	}

	public MatchStarEntity cloneEntity() {
		MatchStarEntity entity = new MatchStarEntity();
		entity.userId = this.userId;
		entity.matchType = this.matchType;
		entity.chapterId = this.chapterId;
		entity.chapterStars = this.chapterStars;
		entity.chapterScores = this.chapterScores;
		return entity;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> chapterStarsMap = new HashMap<Integer, Integer>();

		chapterStarsMap.put(1001, 1);
		String s = JsonUtil.gsonObj2String(chapterStarsMap);
		Map<Integer, Integer> chapterStarsMaps = JsonUtil.transferJsonTOJavaBean(s, chapterStarsMap.getClass());
		System.out.println(chapterStarsMaps.get(1001));
		for (Entry<Integer, Integer> e : chapterStarsMaps.entrySet()) {

			int a = Integer.parseInt(String.valueOf(e.getKey()));
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}
}
