package com.ljh.until;

/**
 * @author Liu.jihong
 * @date 2019-09-03 20:09
 */

import java.util.HashMap;
import java.util.Map;

/**
 *json工具类
 */
public class JsonResult {
    private int statusCode;//200成功 100失败
    private String message;//提示信息
    private Map<String,Object> datas=new HashMap<>();

    /**
     *默认情况下 ，成功的操作
     */
    public JsonResult(){
        this(200,"");
    }
    public JsonResult(int statusCode,String message){
        this.statusCode=statusCode;
        this.message=message;
    }

    /**
     * 把数据存入集合中
     * @param name
     * @param value
     * @return
     */
    public JsonResult addData(String name,Object value){
        datas.put(name,value);
        return this;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDatas() {
        return datas;
    }

    public void setDatas(Map<String, Object> datas) {
        this.datas = datas;
    }
}
