package com.cwa.data.entity.spread;

import java.util.List;

import baseice.basedao.IKey;

import com.cwa.component.data.operate.pool.IOperatePool;
import com.cwa.component.data.operate.DaoOperateFactory;
import com.cwa.component.data.operate.IDaoOperate;
import com.cwa.component.data.operate.TypeDaoOperate.DaoOperateType;
import com.cwa.data.entity.IMatchStarEntityDao;
import com.cwa.data.entity.domain.MatchStarEntity;

public class MatchStarEntityDao implements IMatchStarEntityDao {
	private IMatchStarEntityDao dao;

	protected IOperatePool operatePool;// 操作池
	protected DaoOperateFactory daoOperateFactory;// 数据操作工厂
	
	@Override
	public List<MatchStarEntity> selectEntity(IKey key, Object attach) {
		//DefaultKey defaultKey = (DefaultKey) key;
		//if (defaultKey.functionName.equals("selectEntityByChannel")) {
		//	return dao.selectEntity(defaultKey);
		//}
		return null;
	}

	@Override
	public MatchStarEntity selectEntityByUserIdAndMatchTypeAndChapterId(long userId,int matchType,int chapterId,Object attach) {
		MatchStarEntity entity =( MatchStarEntity)dao.selectEntityByUserIdAndMatchTypeAndChapterId(userId, matchType, chapterId, attach);
		if(entity != null){
		   entity.obtainAfter();
		}
		return entity;
	}
	@Override
	public List<MatchStarEntity> selectEntityByUserIdAndMatchType(long userId,int matchType,Object attach) {
		List<MatchStarEntity> entitys = dao.selectEntityByUserIdAndMatchType(userId, matchType, attach);
		for (MatchStarEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	@Override
	public List<MatchStarEntity> selectEntityByUserId(long userId,Object attach) {
		List<MatchStarEntity> entitys = dao.selectEntityByUserId(userId, attach);
		for (MatchStarEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	

	@Override
	public List<MatchStarEntity> selectAllEntity(Object attach) {
	    List<MatchStarEntity> entitys = dao.selectAllEntity(attach);
	    for (MatchStarEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	
	@Override
	public void insertEntity(MatchStarEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Insert, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void updateEntity(MatchStarEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Update, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void removeEntity(MatchStarEntity entity, Object attach) {
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Remove, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchInsertEntity(List<MatchStarEntity> entitys, Object attach) {
	    for (MatchStarEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchInsert, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchUpdateEntity(List<MatchStarEntity> entitys, Object attach) {
	    for (MatchStarEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchUpdate, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchRemoveEntity(List<MatchStarEntity> entitys, Object attach) {
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

	public void setDao(IMatchStarEntityDao dao) {
		this.dao = dao;
	}
	
	public void setOperatePool(IOperatePool operatePool) {
		this.operatePool = operatePool;
	}

	public void setDaoOperateFactory(DaoOperateFactory daoOperateFactory) {
		this.daoOperateFactory = daoOperateFactory;
	}
}
