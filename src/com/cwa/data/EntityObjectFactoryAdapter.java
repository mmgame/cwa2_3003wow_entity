package com.cwa.data;

import Ice.Object;
import Ice.ObjectFactory;

import wow.data.entity.AccountGeneralEntity;
import com.cwa.data.entity.domain.AccountEntity;
import wow.data.entity.AccountcountGeneralEntity;
import com.cwa.data.entity.domain.AccountcountEntity;
import wow.data.entity.UsereconomyGeneralEntity;
import com.cwa.data.entity.domain.UsereconomyEntity;
import wow.data.entity.EquipmentGeneralEntity;
import com.cwa.data.entity.domain.EquipmentEntity;
import wow.data.entity.FormationGeneralEntity;
import com.cwa.data.entity.domain.FormationEntity;
import wow.data.entity.HeroGeneralEntity;
import com.cwa.data.entity.domain.HeroEntity;
import wow.data.entity.ItemGeneralEntity;
import com.cwa.data.entity.domain.ItemEntity;
import wow.data.entity.MatchGeneralEntity;
import com.cwa.data.entity.domain.MatchEntity;
import wow.data.entity.MatchStarGeneralEntity;
import com.cwa.data.entity.domain.MatchStarEntity;
import wow.data.entity.MatchMopupGeneralEntity;
import com.cwa.data.entity.domain.MatchMopupEntity;
import wow.data.entity.MatchShopGeneralEntity;
import com.cwa.data.entity.domain.MatchShopEntity;
import wow.data.entity.MatchConcealGeneralEntity;
import com.cwa.data.entity.domain.MatchConcealEntity;
import wow.data.entity.MatchAwardGeneralEntity;
import com.cwa.data.entity.domain.MatchAwardEntity;
import wow.data.entity.RegionGeneralEntity;
import com.cwa.data.entity.domain.RegionEntity;
import wow.data.entity.TestUserGeneralEntity;
import com.cwa.data.entity.domain.TestUserEntity;
import wow.data.entity.UserinfoGeneralEntity;
import com.cwa.data.entity.domain.UserinfoEntity;
import wow.data.entity.UserattrGeneralEntity;
import com.cwa.data.entity.domain.UserattrEntity;
import wow.data.entity.VipGeneralEntity;
import com.cwa.data.entity.domain.VipEntity;

/**
 * 对象工厂适配，通过staticId转化对应的类
 * 
 * @author mausmars
 * 
 */
public class EntityObjectFactoryAdapter implements ObjectFactory {
	@Override
	public Object create(String type) {
		if (type.equals(AccountGeneralEntity.ice_staticId())){
			return new AccountEntity();
		}
		if (type.equals(AccountcountGeneralEntity.ice_staticId())){
			return new AccountcountEntity();
		}
		if (type.equals(UsereconomyGeneralEntity.ice_staticId())){
			return new UsereconomyEntity();
		}
		if (type.equals(EquipmentGeneralEntity.ice_staticId())){
			return new EquipmentEntity();
		}
		if (type.equals(FormationGeneralEntity.ice_staticId())){
			return new FormationEntity();
		}
		if (type.equals(HeroGeneralEntity.ice_staticId())){
			return new HeroEntity();
		}
		if (type.equals(ItemGeneralEntity.ice_staticId())){
			return new ItemEntity();
		}
		if (type.equals(MatchGeneralEntity.ice_staticId())){
			return new MatchEntity();
		}
		if (type.equals(MatchStarGeneralEntity.ice_staticId())){
			return new MatchStarEntity();
		}
		if (type.equals(MatchMopupGeneralEntity.ice_staticId())){
			return new MatchMopupEntity();
		}
		if (type.equals(MatchShopGeneralEntity.ice_staticId())){
			return new MatchShopEntity();
		}
		if (type.equals(MatchConcealGeneralEntity.ice_staticId())){
			return new MatchConcealEntity();
		}
		if (type.equals(MatchAwardGeneralEntity.ice_staticId())){
			return new MatchAwardEntity();
		}
		if (type.equals(RegionGeneralEntity.ice_staticId())){
			return new RegionEntity();
		}
		if (type.equals(TestUserGeneralEntity.ice_staticId())){
			return new TestUserEntity();
		}
		if (type.equals(UserinfoGeneralEntity.ice_staticId())){
			return new UserinfoEntity();
		}
		if (type.equals(UserattrGeneralEntity.ice_staticId())){
			return new UserattrEntity();
		}
		if (type.equals(VipGeneralEntity.ice_staticId())){
			return new VipEntity();
		}
		return null;
	}

	@Override
	public void destroy() {
	}
}
