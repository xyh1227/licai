package cn.baibaisqt.domain;

import java.util.Date;

/**
 * licai_family_income
 * 
 * @author xyh
 * @version 1.0.0 2022-01-12
 */
public class LicaiFamilyIncome implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8630956749599727753L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private String id;

    /** 收入类型 */
    private String fName;

    /** 家庭收入 */
    private Integer fIncome;

    /** 1代表收入,0代表消费 */
    private Integer fTypeMoney;

    /** fDate */
    private Date fDate;

    /** 用户id */
    private String uId;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取收入类型
     * 
     * @return 收入类型
     */
    public String getFName() {
        return this.fName;
    }

    /**
     * 设置收入类型
     * 
     * @param fName
     *          收入类型
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * 获取家庭收入
     * 
     * @return 家庭收入
     */
    public Integer getFIncome() {
        return this.fIncome;
    }

    /**
     * 设置家庭收入
     * 
     * @param fIncome
     *          家庭收入
     */
    public void setFIncome(Integer fIncome) {
        this.fIncome = fIncome;
    }

    /**
     * 获取1代表收入,0代表消费
     * 
     * @return 1代表收入
     */
    public Integer getFTypeMoney() {
        return this.fTypeMoney;
    }

    /**
     * 设置1代表收入,0代表消费
     * 
     * @param fTypeMoney
     *          1代表收入
     */
    public void setFTypeMoney(Integer fTypeMoney) {
        this.fTypeMoney = fTypeMoney;
    }

    /**
     * 获取fDate
     * 
     * @return fDate
     */
    public Date getFDate() {
        return this.fDate;
    }

    /**
     * 设置fDate
     * 
     * @param fDate
     */
    public void setFDate(Date fDate) {
        this.fDate = fDate;
    }

    /**
     * 获取用户id
     * 
     * @return 用户id
     */
    public String getUId() {
        return this.uId;
    }

    /**
     * 设置用户id
     * 
     * @param uId
     *          用户id
     */
    public void setUId(String uId) {
        this.uId = uId;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}