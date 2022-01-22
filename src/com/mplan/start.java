package com.mplan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class start {
    public static void main(String[] args) throws IOException {
        //获取json文件中的数据
        File file=new File("src/com/mplan/rec/setting.json");
        String content= FileUtils.readFileToString(file,"UTF-8");
        JSONObject jsonFile=new JSONObject(content);
        //定义ip与端口
        String portString = jsonFile.getString("port");
        String ip = jsonFile.getString("ip");
        int port = Integer.parseInt(portString);//将String类型的数据转换为int

        new Mform(ip,port);        
    }
}
