package org.lanqiao.zyysys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 字典表类型

 * @TableName dict
 */
@Data
public class Dict implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 
     */
    private String dictIstree;

    /**
     * 描述
     */
    private String dictDescription;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date itemcreateat;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}