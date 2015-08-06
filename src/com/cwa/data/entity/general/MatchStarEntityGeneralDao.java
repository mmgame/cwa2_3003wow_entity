package com.cwa.data.entity.general;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseice.basedao.IKey;

import org.apache.ibatis.session.SqlSession;

import com.cwa.data.entity.IMatchStarEntityDao;
import com.cwa.data.entity.domain.MatchStarEntity;

public class MatchStarEntityGeneralDao implements IMatchStarEntityDao {
	protected static String namespace = MatchStarEntity.class.getCanonicalName();

	public MatchStarEntityGeneralDao() {
	}

	@Override
	public List<MatchStarEntity> selectEntity(IKey key, Object attach) {
		//DefaultKey defaultKey = (DefaultKey) key;
		//if (defaultKey.functionName.equals("selectEntityByUserId")) {
		//}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public MatchStarEntity selectEntityByUserIdAndMatchTypeAndChapterId(long userId,int matchType,int chapterId,Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("userId", userId);
		paras.put("matchType", matchType);
		paras.put("chapterId", chapterId);
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		List<MatchStarEntity> list = sqlSessionTemplate.selectList(namespace + ".selectByUserIdAndMatchTypeAndChapterId", paras);
		return list.isEmpty()?null : list.get(0);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchStarEntity> selectEntityByUserIdAndMatchType(long userId,int matchType,Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("userId", userId);
		paras.put("matchType", matchType);
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectByUserIdAndMatchType", paras);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchStarEntity> selectEntityByUserId(long userId,Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("userId", userId);
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectByUserId", paras);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchStarEntity> selectAllEntity(Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		return sqlSessionTemplate.selectList(namespace + ".selectAllEntity", paras);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void insertEntity(MatchStarEntity entity, Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.insert(namespace + ".insert", paras);
	}
	
    @SuppressWarnings("unchecked")
	@Override
	public void updateEntity(MatchStarEntity entity, Object attach) {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".update", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void removeEntity(MatchStarEntity entity, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity", entity);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".remove", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void batchInsertEntity(List<MatchStarEntity> entitys, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity_list", entitys);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.insert(namespace + ".batchInsert", paras);
	}
    
    @SuppressWarnings("unchecked")
	@Override
	public void batchUpdateEntity(List<MatchStarEntity> entitys, Object attach)  {
		Map<String, Object> paras = (Map<String, Object>) attach;
		paras.put("entity_list", entitys);
		
		SqlSession sqlSessionTemplate = (SqlSession) paras.get("sql_session");
		sqlSessionTemplate.update(namespace + ".batchUpdate", paras);
	}

    @SuppressWarnings("unchecked")
	@Override
	public void batchRemoveEntity(List<MatchStarEntity> entitys, Object attach) {
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
