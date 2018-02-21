package model.result;

/**
 * 单个对象返回领域模型
 * 适用于查询增加删除单个对象
 */
public class SimpleResult<T> extends BaseResult {

    /**
     * 具体返回的对象
     */
    private T result;

    public SimpleResult(T result) {
        super();
        this.result = result;
    }

    public SimpleResult() {

    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
