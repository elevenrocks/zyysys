package org.lanqiao.zyysys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 权限--角色  关联表
 * @TableName resource_role_ref
 */
@Data
public class ResourceRoleRef implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 
     */
    private String resourceCode;

    /**
     * 
     */
    private String roleCode;

    /**
     * 
     */
    private String creater;

    /**
     * 
     */
    private Date itemcreateat;

    /**
     * 
     */
    private String updater;

    /**
     * 
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}