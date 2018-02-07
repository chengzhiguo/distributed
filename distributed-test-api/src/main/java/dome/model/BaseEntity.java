package dome.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 实体公共属性
 * @author David
 * @date 2018-01-15 16:15
 */
public class BaseEntity implements Serializable {

    /**
     * 删除标记（0：正常；1：删除；2：审核；）
     */
//    public static final String DEL_FLAG_NORMAL = "0";
//    public static final String DEL_FLAG_DELETE = "1";
//    public static final String DEL_FLAG_AUDIT = "2";


    /** 添加时间 */
    private Date dateAdd;

    /** 修改时间 */
    private Date dateUpd;
//    private String delFlag;     //0 有效 1 删除


    public BaseEntity() {

    }

    public BaseEntity(Date dateAdd, Date dateUpd) {
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(Date dateUpd) {
        this.dateUpd = dateUpd;
    }
}