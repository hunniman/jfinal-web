package com.joker.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRolesResources<M extends BaseRolesResources<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setRoleId(Integer roleId) {
		set("role_id", roleId);
	}

	public Integer getRoleId() {
		return get("role_id");
	}

	public void setResourceId(Integer resourceId) {
		set("resource_id", resourceId);
	}

	public Integer getResourceId() {
		return get("resource_id");
	}

}
