package util;

import com.aliyun.oss.OSSClient;

public class OssClientUtil {

    private static final String endPoint;

    private static final String accessId;

    private static final String accessKeySecret;

    private OSSClient ossClient=new OSSClient(endPoint,accessId,accessKeySecret);

    public void do(){
        ossClient.uploadFile()
    }
}
