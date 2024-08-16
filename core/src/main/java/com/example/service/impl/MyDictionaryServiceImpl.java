package com.example.service.impl;

import com.example.service.MydictionaryService;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MyDictionaryServiceImpl implements MydictionaryService, Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private Environment evn;

    @Override
    public String get(String key, Object[] params) {
        String phrase = get(key);
        if ((params != null) && (params.length > 0)) {
            return String.format(phrase, params);
        }
        return phrase;
    }

    @Override
    public String get(String key, Object param) {
        String phrase = get(key);
        if ((param != null)) {
            return String.format(phrase, param);
        }
        return phrase;
    }

    @Override
    public String get(String key) {
        try {
            String phrase = StringUtil.nvl(
                    evn.getRequiredProperty(key), "");
            return new String(phrase.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String get(String key, Object param1, Object param2) {
        List<String> temp = new ArrayList<String>();
        temp.add(param1.toString());
        temp.add(param2.toString());
        return get(key, temp);
    }

    @Override
    public String get(String key, Object param1, Object param2, Object param3) {
        List<String> temp = new ArrayList<String>();
        temp.add(param1.toString());
        temp.add(param2.toString());
        temp.add(param3.toString());
        return get(key, temp);
    }

}
