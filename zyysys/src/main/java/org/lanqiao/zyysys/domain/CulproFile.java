package org.lanqiao.zyysys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件上传记录表
 * @TableName tb_culpro_file
 */
@Data
public class CulproFile implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * 唯一标识
     */
    private String itemcode;

    /**
     * 数据源itemcode
     */
    private String dataCode;

    /**
     * 上传人
     */
    private String uploader;

    /**
     * 上传人的id
     */
    private String uploaderCode;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件文件类型 文档或图片
     */
    private String fileType;

    /**
     * 
     */
    private Double fileSize;

    /**
     * 附件路径
     */
    private String filePath;

    /**
     * 
     */
    private Date itemcreateat;

    private static final long serialVersionUID = 1L;
}