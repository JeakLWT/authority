package com.tangyao.authority.util;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

public class FdfsUtil {

    static {
        try {
            ClientGlobal.init("fdfs.conf");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static String FdfsUploadFile() throws IOException, MyException {
        TrackerClient trackerClient = new TrackerClient();
        //4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        //5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        //6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        //7、直接调用StorageClient对象方法上传文件即可。
        String[] result = storageClient.upload_file("/Users/lwt/Desktop/1369025_192645024000_2.jpg", "jpg", null);
        StringBuilder sb = new StringBuilder("http://47.105.176.198/");
        sb.append(result[0]).append("/").append(result[1]);

        return sb.toString();
    }
}
