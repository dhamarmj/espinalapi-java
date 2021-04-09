package DAO;

import java.util.List;

public class DataJson {

    public int code;
    public String msg;
    public List<?> value;


    public DataJson() {
        this.code = 100;
        this.msg = "OK";
    }


    public DataJson(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getValue() {
        return this.value;
    }

    public void setValue(List<?> value) {
        this.value = value;
    }

    
}
