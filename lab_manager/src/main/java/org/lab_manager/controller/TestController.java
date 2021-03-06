package org.lab_manager.controller;
/**
 * Created by xiaofeige on 2016/5/22.
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.sun.javafx.collections.MappingChange;
import com.sun.javafx.collections.ObservableFloatArrayImpl;
import org.lab_manager.service.serviceImp.ExperimentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/postTest_ajax")
public class TestController {
//    @ResponseBody
//    @RequestMapping(method = RequestMethod.POST)
//    public String printWelcome(@RequestBody String json) {
//        System.out.println(json);
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("test","hahaha");
//        Map<String,Object> map2=new HashMap<String,Object>();
//        map2.put("wangdasha","zhenshisha");
//        map.put("little",map2);
//        return JSON.toJSONString(map);
//    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public String printWelcome(@RequestBody String s) {
        String ssss = JSON.parseObject(s, new TypeReference<String>(){});
        System.out.println(ssss+"=======");

        return JSON.toJSONString("hello");
    }
}