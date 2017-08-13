package com.nowcoder.service;

import org.springframework.stereotype.Service;

/**
 * Created by chenxueqiang.
 */
@Service
public class WendaService {
    /**
     * 测试
     * @param userId
     * @return
     */
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
