package io.netty.example.buffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: MuYa
 * @Date : 2018/3/7
 * @Time : 14:55
 * @Description:
 */
public class BufferDemo {
    public final static Logger logger = LoggerFactory.getLogger(BufferDemo.class.getName());

    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        logger.info("position:{},limit:{},capacity:{}", intBuffer.position(), intBuffer.limit(), intBuffer.capacity());
        intBuffer.put(10);

        Map<String, String> map = new HashMap<String, String>(3);
        map.put("1", "hello");


        for (int i = 0; i < 11; i++) {
            intBuffer.put(i);
            logger.info("position:{},limit:{},capacity:{}", intBuffer.position(), intBuffer.limit(), intBuffer.capacity());

        }
        logger.info("position:{},limit:{},capacity:{}", intBuffer.position(), intBuffer.limit(), intBuffer.capacity());

    }

}
