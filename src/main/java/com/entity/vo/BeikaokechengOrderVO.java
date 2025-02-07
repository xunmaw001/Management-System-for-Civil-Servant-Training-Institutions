package com.entity.vo;

import com.entity.BeikaokechengOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 备考课程预定
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("beikaokecheng_order")
public class BeikaokechengOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 预定人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预定课程
     */

    @TableField(value = "beikaokecheng_id")
    private Integer beikaokechengId;


    /**
     * 预定时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：预定人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：预定人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预定课程
	 */
    public Integer getBeikaokechengId() {
        return beikaokechengId;
    }


    /**
	 * 获取：预定课程
	 */

    public void setBeikaokechengId(Integer beikaokechengId) {
        this.beikaokechengId = beikaokechengId;
    }
    /**
	 * 设置：预定时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：预定时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
