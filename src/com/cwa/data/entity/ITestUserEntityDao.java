package com.cwa.data.entity;

import java.util.List;

import com.cwa.component.data.IEntityDao;
import com.cwa.data.entity.domain.TestUserEntity;

public interface ITestUserEntityDao extends IEntityDao<TestUserEntity> {
	
	public TestUserEntity selectEntityByUserId(long userId,Object attach);
}
