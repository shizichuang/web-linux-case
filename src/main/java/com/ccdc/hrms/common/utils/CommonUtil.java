package com.ccdc.hrms.common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.common.utils
 * @ClassName: commonutil
 * @Author: zichuangshi
 * @Description: 共用的，单独的工具类
 * @Date: 2020/9/10 16:24
 * @Version: 1.0
 */
public class CommonUtil {
    private static Logger logger = Logger.getLogger(CommonUtil.class);

    /**
     * ajax反馈
     *
     * @param response
     * @param responseString response反馈信息
     */
    public static void writerResponse(HttpServletResponse response, String responseString) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(responseString);
        } catch (IOException e) {
            logger.error("response error",e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }

    public static boolean isEmpty(Object obj){
        if(null == obj){
            return true;
        }else if(obj instanceof List){
            return ((List)obj).size() <= 0;
        }else if(obj instanceof Map){
            return ((Map)obj).size()<=0;
        }else if(obj instanceof Set){
            return ((Set)obj).size()<=0;
        }else if(obj instanceof String){
            return ((String)obj).length()<=0;
        }else if(obj instanceof StringBuffer){
            return ((StringBuffer)obj).length()<=0;
        }else{
            return obj instanceof Double?((Double)obj).isNaN() : false;
        }
    }

    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }
}
