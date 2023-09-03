package com.nott.Provider;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableBinding(Source.class)
public class TinyImagesUploadProvider {

    @Resource
    private MessageChannel output;


    public void sendMessages(JSONObject jsonObject) {

        this.output.send(MessageBuilder.withPayload(jsonObject).build());

    }

}
