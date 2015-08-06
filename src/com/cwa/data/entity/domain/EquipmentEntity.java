package com.cwa.data.entity.domain;

import wow.data.entity.EquipmentGeneralEntity;

import com.cwa.component.data.ISpreadEntity;
import com.cwa.data.entity.constant.DaoConstant;
import com.cwa.util.OrderListMap;
import com.cwa.util.constant.UtilConstant;

public class EquipmentEntity extends EquipmentGeneralEntity implements ISpreadEntity {
	private static final long serialVersionUID = 1L;

	private OrderListMap plugIdGroove;

	/**
	 * 设置插件
	 * 
	 * @param index
	 * @param eKeyId
	 * @return
	 */
	public int setPlugId(int index, int pKeyId) {
		Integer p = (Integer) plugIdGroove.set3Object(index - 1, pKeyId);
		if (p == null) {
			return -1;
		}
		return pKeyId;
	}

	public int[] getPIds() {
		Object[] objs = plugIdGroove.getList();
		int[] plugIds = new int[objs.length];
		for (int i = 0; i < objs.length; i++) {
			plugIds[i] = (Integer) objs[i];
		}
		return plugIds;
	}

	public boolean isEmpty(int index) {
		return plugIdGroove.isEmpty(index - 1);
	}

	public static void main(String args[]) {
		EquipmentEntity entity = new EquipmentEntity();
		entity.plugs = "101,0,301,0,501,601";
		entity.obtainAfter();

		// System.out.println(entity.setGemId(0, 102));
		// System.out.println(entity.setEquipmentId(0, 11));
		//
		// entity.saveBefore();
		// System.out.println(entity.getGemIds());
		// System.out.println(entity.getEquipmentIds());
		// System.out.println("=======================================");
		// entity.obtainAfter();
		// System.out.println(entity.setGemId(0, 0));
		// System.out.println(entity.setEquipmentId(0, 0));
		//
		// entity.saveBefore();
		// System.out.println(entity.getGemIds());
		// System.out.println(entity.getEquipmentIds());
		// System.out.println("=======================================");
		// entity.obtainAfter();
		// System.out.println(entity.setGemId(0, 301));
		// System.out.println(entity.setEquipmentId(0, 2));
		//
		// entity.saveBefore();
		// System.out.println(entity.getGemIds());
		// System.out.println(entity.getEquipmentIds());
	}

	@Override
	public void obtainAfter() {
		plugIdGroove = new OrderListMap(DaoConstant.PLUG_MAX_POSITION, 0);
		String[] plugIdKeys = this.plugs.split(UtilConstant.COMMA_SEPARATOR);
		for (int i = 0; i < plugIdKeys.length; i++) {
			Integer keyId = Integer.parseInt(plugIdKeys[i]);
			if (keyId <= 0) {
				continue;
			}
			plugIdGroove.set3Object(i, keyId);
		}
	}

	@Override
	public void saveBefore() {
		if (plugIdGroove == null) {
			plugIdGroove = new OrderListMap(DaoConstant.PLUG_MAX_POSITION, 0);
		}
		this.plugs = plugIdGroove.getListString(UtilConstant.COMMA_SEPARATOR);
	}

	@Override
	public void saveAfter() {
	}

	public EquipmentEntity cloneEntity() {
		EquipmentEntity entity = new EquipmentEntity();
		entity.userId = this.userId;
		entity.heroId = this.heroId;
		entity.positionId = this.positionId;
		entity.equipmentLevel = this.equipmentLevel;
		entity.equipmentQuality = this.equipmentQuality;
		entity.plugs = this.plugs;
		return entity;
	}
}
