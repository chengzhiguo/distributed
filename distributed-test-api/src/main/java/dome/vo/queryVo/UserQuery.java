package dome.vo.queryVo;



import java.io.Serializable;

/**
 * 查询辅助类
 * @Description 查询条件
 * @author David
 * @date 2018-01-15 16:15
 */
public class UserQuery extends Pagination implements Serializable {
    private static final long serialVersionUID = 1609252883937908952L;

    //查询条件
    private int notId = -1;
    /** 园区编号 */
    private String parkCode;
    /** 登录名 or 真实姓名 */
    private String name;
    /** 登录名 or 真实姓名 模糊查询 */
    private String nameLike;
    //查询条件
    public int groupId = -1; //组ID


    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }
}
