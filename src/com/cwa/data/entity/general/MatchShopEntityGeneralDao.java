package com.cwa.data.entity.general;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseice.basedao.IKey;

import org.apache.ibatis.session.SqlSession;

import com.cwa.data.entity.IMatchShopEntityDao;
import com.cwa.data.entity.domain.MatchShopEntity;

public class MatchShopEntityGeneralDao implements IMatchShopEntityDao {
	protected static String namespace = MatchShopEntity.class.getCanonicalName();

	public MatchShopEntityGeneralDao() {
	}

	@Override
	public List<MatchShopEntity> selectEntity(IKey key, Object attach) {
		//DefaultKey defaultKey = (DefaultKey) key;
		//if (defaultKey.functionName.equals("selectEntityByUserId")) {
		//}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public MatchShopEntity selectEntityByUserIdAndShopType(long userId,int shopType,Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("userId", userId);
		paras.put("shopType", shopType);
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		List<MatchShopEntity> list = sqlSessionTemplate.selectList(namespace + ".selectByUserIdAndShopType", paras);
		return list.isEmpty()?null : list.get(0);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchShopEntity> selectEntityByUserId(long userId,Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("userId", userId);
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectByUserId", paras);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchShopEntity> selectAllEntity(Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectAllEntity", paras);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void insertEntity(MatchShopEntity entity, Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.insert(namespace + ".insert", paras);
	}
	
    @SuppressWarnings("unchecked")
	@Override
	public void updateEntity(MatchShopEntity entity, Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".update", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void removeEntity(MatchShopEntity entity, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".remove", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void batchInsertEntity(List<MatchShopEntity> entitys, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity_list", entitys);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.insert(namespace + ".batchInsert", paras);
	}
    
    @SuppressWarnings("unchecked")
	@Override
	public void batchUpdateEntity(List<MatchShopEntity> entitys, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity_list", entitys);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".batchUpdate", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void batchRemoveEntity(List<MatchShopEntity> entitys, Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity_list", entitys);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".batchRemove", paras);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void createTable(Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.insert(namespace + ".createTable", paras);
	}

	@Override
	public List<String> selectAllTableName(Object attach) {
		Map<String, Object> paras = new HashMap<String, Object>();
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectAllTableName", paras);
	}
}
