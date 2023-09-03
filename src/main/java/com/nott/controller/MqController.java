package com.nott.controller;

import com.alibaba.fastjson.JSONObject;
import com.nott.Provider.TinyImagesUploadProvider;
import com.nott.common.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mq/producer/")
public class MqController {

    @Resource
    private TinyImagesUploadProvider tinyImagesUploadProvider;

    @RequestMapping("message")
    public R sendMessage(@RequestBody JSONObject req){
        tinyImagesUploadProvider.sendMessages(req);
        return R.ok();
    }
}
