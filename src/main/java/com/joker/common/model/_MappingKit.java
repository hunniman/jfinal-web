package com.joker.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("resources", "resource_id", Resources.class);
		arp.addMapping("roles", "role_id", Roles.class);
		arp.addMapping("roles_resources", "id", RolesResources.class);
		arp.addMapping("users_roles", "id", UsersRoles.class);
	}
}
