package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 考生姓名
     */
    private String yonghuName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String yonghuIdNumber;


    /**
     * 手机号
     */
    private String yonghuPhone;


    /**
     * 照片
     */
    private String yonghuPhoto;


    /**
     * 学校
     */
    private String yonghuXuexiao;


    /**
     * 专业
     */
    private String yonghuZhuanye;


    /**
     * 余额
     */
    private Double newMoney;

    public Double getNewMoney() {
        return newMoney;
    }

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }

    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：考生姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：考生姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：学校
	 */
    public String getYonghuXuexiao() {
        return yonghuXuexiao;
    }


    /**
	 * 设置：学校
	 */
    public void setYonghuXuexiao(String yonghuXuexiao) {
        this.yonghuXuexiao = yonghuXuexiao;
    }
    /**
	 * 获取：专业
	 */
    public String getYonghuZhuanye() {
        return yonghuZhuanye;
    }


    /**
	 * 设置：专业
	 */
    public void setYonghuZhuanye(String yonghuZhuanye) {
        this.yonghuZhuanye = yonghuZhuanye;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
