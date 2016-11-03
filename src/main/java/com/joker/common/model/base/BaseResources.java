package com.joker.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseResources<M extends BaseResources<M>> extends Model<M> implements IBean {

	public void setResourceId(Long resourceId) {
		set("resource_id", resourceId);
	}

	public Long getResourceId() {
		return get("resource_id");
	}

	public void setResourceName(String resourceName) {
		set("resource_name", resourceName);
	}

	public String getResourceName() {
		return get("resource_name");
	}

	public void setResourceType(String resourceType) {
		set("resource_type", resourceType);
	}

	public String getResourceType() {
		return get("resource_type");
	}

	public void setResourceString(String resourceString) {
		set("resource_string", resourceString);
	}

	public String getResourceString() {
		return get("resource_string");
	}

	public void setResourceDesc(String resourceDesc) {
		set("resource_desc", resourceDesc);
	}

	public String getResourceDesc() {
		return get("resource_desc");
	}

	public void setEnabled(Integer enabled) {
		set("enabled", enabled);
	}

	public Integer getEnabled() {
		return get("enabled");
	}

	public void setResourceMethod(String resourceMethod) {
		set("resource_method", resourceMethod);
	}

	public String getResourceMethod() {
		return get("resource_method");
	}

}
