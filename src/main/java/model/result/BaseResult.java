package model.result;

import model.BaseObject;



/**
 * 基础返回领域模型
 * 适用于删除是否成功
 */
public class BaseResult extends BaseObject {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 返回信息
     */
    private String message;

    public BaseResult() {
        this(false);
    }

    public BaseResult(boolean success) {
        this(success, null);
    }

    public BaseResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
