package com.cwa.data.entity.spread;

import java.util.List;

import baseice.basedao.IKey;

import com.cwa.component.data.operate.pool.IOperatePool;
import com.cwa.component.data.operate.DaoOperateFactory;
import com.cwa.component.data.operate.IDaoOperate;
import com.cwa.component.data.operate.TypeDaoOperate.DaoOperateType;
import com.cwa.data.entity.IHeroEntityDao;
import com.cwa.data.entity.domain.HeroEntity;

public class HeroEntityDao implements IHeroEntityDao {
	private IHeroEntityDao dao;

	protected IOperatePool operatePool;// 操作池
	protected DaoOperateFactory daoOperateFactory;// 数据操作工厂
	
	@Override
	public List<HeroEntity> selectEntity(IKey key, Object attach) {
		//DefaultKey defaultKey = (DefaultKey) key;
		//if (defaultKey.functionName.equals("selectEntityByChannel")) {
		//	return dao.selectEntity(defaultKey);
		//}
		return null;
	}

	@Override
	public HeroEntity selectEntityByUserIdAndHeroId(long userId,int heroId,Object attach) {
		HeroEntity entity =( HeroEntity)dao.selectEntityByUserIdAndHeroId(userId, heroId, attach);
		if(entity != null){
		   entity.obtainAfter();
		}
		return entity;
	}
	@Override
	public List<HeroEntity> selectEntityByUserId(long userId,Object attach) {
		List<HeroEntity> entitys = dao.selectEntityByUserId(userId, attach);
		for (HeroEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	

	@Override
	public List<HeroEntity> selectAllEntity(Object attach) {
	    List<HeroEntity> entitys = dao.selectAllEntity(attach);
	    for (HeroEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	
	@Override
	public void insertEntity(HeroEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Insert, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void updateEntity(HeroEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Update, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void removeEntity(HeroEntity entity, Object attach) {
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Remove, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchInsertEntity(List<HeroEntity> entitys, Object attach) {
	    for (HeroEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchInsert, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchUpdateEntity(List<HeroEntity> entitys, Object attach) {
	    for (HeroEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchUpdate, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchRemoveEntity(List<HeroEntity> entitys, Object attach) {
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchRemove, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void createTable(Object attach) {
		dao.createTable(attach);
	}

	@Override
	public List<String> selectAllTableName(Object attach) {
		return dao.selectAllTableName(attach);
	}
	// ------------------------------

	public void setDao(IHeroEntityDao dao) {
		this.dao = dao;
	}
	
	public void setOperatePool(IOperatePool operatePool) {
		this.operatePool = operatePool;
	}

	public void setDaoOperateFactory(DaoOperateFactory daoOperateFactory) {
		this.daoOperateFactory = daoOperateFactory;
	}
}
