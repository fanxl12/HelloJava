package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/29 14:54
 */
public class LogTest {

    public static void main(String[] args) {
        String log = "<188>Jun 16 2020 04:04:03 USG9560-1 %%01SEC/4/POLICYPERMIT(l)[2437168]:VSYS=public; Slot=4/3; protocol=6; source-ip=2001:0db8:85a3:0000:0000:8a2e:0370:7334; source-port=44254; destination-ip=1080::8:800:200C:417A; destination-port=445; time=2020/06/16 12:04:03; zone-trust; policy=19;";

        Pattern r = Pattern.compile("<(?<syslogLevel>\\d{0,3})>.*?\\s+(?<deviceName>[\\S]+(?=\\s%%)).*?VSYS=(?:public|(?<vsys>.*?));.*?\\s+protocol=(?<protocol>\\w*);\\s+source-ip=((?:[0-9a-fA-F]{0,4}:){1,7}[0-9a-fA-F]{0,4});\\s+source-port=(?<srcPort>\\d*);\\s+destination-ip=((?:[0-9a-fA-F]{0,4}:){1,7}[0-9a-fA-F]{0,4});\\s+destination-port=(?<dstPort>\\d*);\\s?time=(?<time>.*?);.*?policy=(?<policyid>.*?).$");

        Matcher m = r.matcher(log);
        if (m.find()) {
            int groupCount = m.groupCount() + 1;
            for (int i = 0; i < groupCount; i++) {
                System.out.println(i + ":" + m.group(i));
            }
//            String sourceIp = m.group(6);
//            System.out.println(sourceIp);
//            System.out.println(m.group(8));
        }


    }

}
