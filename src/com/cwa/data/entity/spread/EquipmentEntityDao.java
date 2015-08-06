package com.cwa.data.entity.spread;

import java.util.List;

import baseice.basedao.IKey;

import com.cwa.component.data.operate.pool.IOperatePool;
import com.cwa.component.data.operate.DaoOperateFactory;
import com.cwa.component.data.operate.IDaoOperate;
import com.cwa.component.data.operate.TypeDaoOperate.DaoOperateType;
import com.cwa.data.entity.IEquipmentEntityDao;
import com.cwa.data.entity.domain.EquipmentEntity;

public class EquipmentEntityDao implements IEquipmentEntityDao {
	private IEquipmentEntityDao dao;

	protected IOperatePool operatePool;// 操作池
	protected DaoOperateFactory daoOperateFactory;// 数据操作工厂
	
	@Override
	public List<EquipmentEntity> selectEntity(IKey key, Object attach) {
		//DefaultKey defaultKey = (DefaultKey) key;
		//if (defaultKey.functionName.equals("selectEntityByChannel")) {
		//	return dao.selectEntity(defaultKey);
		//}
		return null;
	}

	@Override
	public EquipmentEntity selectEntityByUserIdAndHeroIdAndPositionId(long userId,int heroId,int positionId,Object attach) {
		EquipmentEntity entity =( EquipmentEntity)dao.selectEntityByUserIdAndHeroIdAndPositionId(userId, heroId, positionId, attach);
		if(entity != null){
		   entity.obtainAfter();
		}
		return entity;
	}
	@Override
	public List<EquipmentEntity> selectEntityByUserIdAndHeroId(long userId,int heroId,Object attach) {
		List<EquipmentEntity> entitys = dao.selectEntityByUserIdAndHeroId(userId, heroId, attach);
		for (EquipmentEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	@Override
	public List<EquipmentEntity> selectEntityByUserId(long userId,Object attach) {
		List<EquipmentEntity> entitys = dao.selectEntityByUserId(userId, attach);
		for (EquipmentEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	

	@Override
	public List<EquipmentEntity> selectAllEntity(Object attach) {
	    List<EquipmentEntity> entitys = dao.selectAllEntity(attach);
	    for (EquipmentEntity entity : entitys) {
	        entity.obtainAfter();
		}
		return entitys;
	}
	
	@Override
	public void insertEntity(EquipmentEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Insert, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void updateEntity(EquipmentEntity entity, Object attach) {
	    entity.saveBefore();
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Update, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void removeEntity(EquipmentEntity entity, Object attach) {
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.Remove, entity, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchInsertEntity(List<EquipmentEntity> entitys, Object attach) {
	    for (EquipmentEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchInsert, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchUpdateEntity(List<EquipmentEntity> entitys, Object attach) {
	    for (EquipmentEntity entity : entitys) {
	        entity.saveBefore();
		}
		IDaoOperate daoOperate = daoOperateFactory.createDaoOperate(dao, DaoOperateType.BatchUpdate, entitys, "", null, attach);
		operatePool.execute(daoOperate);
	}

	@Override
	public void batchRemoveEntity(List<EquipmentEntity> entitys, Object attach) {
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

	public void setDao(IEquipmentEntityDao dao) {
		this.dao = dao;
	}
	
	public void setOperatePool(IOperatePool operatePool) {
		this.operatePool = operatePool;
	}

	public void setDaoOperateFactory(DaoOperateFactory daoOperateFactory) {
		this.daoOperateFactory = daoOperateFactory;
	}
}
