package org.lanqiao.zyysys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 发文、内部会签关联关系表
 * @TableName tb_governres_post_ref
 */
@Data
public class GovernresPostRef implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 发文表中itemCode
     */
    private String dateCode;

    /**
     * 接收人id
     */
    private String receiverId;

    /**
     * 用来区分主送人和抄送人
     */
    private Integer receiverType;

    /**
     * 当处长审核以后才会收到此字段来区分是否发送
     */
    private Integer sendStatus;

    /**
     * 创建者
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