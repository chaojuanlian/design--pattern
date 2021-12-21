package com.wyc.stady.patterns.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author wangyuchao
 * @ClassName: TestDemo1
 * @description:
 * @date 2021/9/27下午5:15
 */
public class TestDemo1 {
    public static void main(String[] args) throws ParseException {
//        String dateStr = "Thu Sep 16 20:05:37 CST 2021";
        String dateStr = "Thu Sep 16 20:05:37 CST 2021";
        if (isValidDate(dateStr)){
            String formatDateStr = formatDate(dateStr);

            System.out.println(formatDateStr);
        }else {
            System.out.println("日期格式错误！");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
    }

    public static String formatDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = dateFormat.parse(dateStr);
        return sdf.format(date);
    }

    /**
     * @Description 校验8位字符串是否为正确的日期格式
     * @Param str
     * @return
     * @Date 2021/9/27 下午5:34
     * @Author wangyuchao
     **/
    public static boolean isValidDate(String dateStr) {
        boolean result = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            dateFormat.setLenient(false);
            dateFormat.parse(dateStr);
        } catch (ParseException e) {
//             e.printStackTrace();
            // 如果throw java.text、、.ParseException或者NullPointerException，就说明格式不对
            result = false;
        }
        return result;
    }
}
