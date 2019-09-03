package com.ljh.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Liu.jihong
 * @date 2019-09-03 14:40
 */

/**
 * 可以在链接上携带区域信息
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        //获取浏览器的区域信息
        Locale locale = Locale.getDefault();
        if(StringUtils.isEmpty(l)){
            String[] s = l.split("_");
            locale=new Locale(s[0],s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
