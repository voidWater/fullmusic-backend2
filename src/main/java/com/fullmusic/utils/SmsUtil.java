package com.fullmusic.utils;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import org.json.JSONException;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;

public class SmsUtil {
    private static int appid = 1400226518;
    private static String appkey = "ebe69434e3786dd3b248bfa6b13837c0";

    public static void main(String[] args) {
        sendSms("17589813615", "");
    }

    public static boolean sendSms(String num, String content) {
        try {
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.send(0, "86", num,
                    "【简乐艺术中心】您的验证码是: 5678", "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
            return false;
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
            return false;
        } catch (com.github.qcloudsms.httpclient.HTTPException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
