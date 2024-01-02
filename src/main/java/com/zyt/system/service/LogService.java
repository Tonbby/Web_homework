package com.zyt.system.service;

import com.zyt.system.entity.Log;
import com.zyt.system.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname LogService
 * @Description None
 * @Date 2023/12/24 12:21
 * @Created by zyt
 */
public interface LogService {
    void insertByLog(Log log);

    PageBean<Log> queryPage(Map<String, Object> paramMap);

    int delByLogIds(List<Integer> ids);
}
