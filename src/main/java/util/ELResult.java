package util;

import java.util.List;

public class ELResult<T> {
    private Integer code; //状态码，0表示成功，其它数字表示失败
    private String msg;  //失败的提示信息
    private Long count;  //表里的记录总数
    private List<T> data;  //返回的数据列表

    public ELResult(Integer code, String msg, Long count, List<T> data){
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static <T> ELResult ok(Long count, List<T> data){
        return new ELResult<T>(0, "", count, data);
    }

    public static <T> ELResult ok(){
        return new ELResult<T>(0, "", null, null);
    }

    public static <T> ELResult error(String msg){
        return new ELResult<T>(1, msg, null, null);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
