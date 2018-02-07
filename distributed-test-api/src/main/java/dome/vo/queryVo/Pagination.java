package dome.vo.queryVo;

/**
 * @Description分页实体类
 * @author David
 * @date 2018-01-15 16:15
 */
public class Pagination {

    //第几页 从0开始
    private int pageNo = 0;
    //每页多少条数据
    private int pageSize = 10;
    private int totalCount = 0;
    private int skip = 0;


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSkip() {
        return this.pageNo * this.pageSize;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }
}
