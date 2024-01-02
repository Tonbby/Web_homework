package com.zyt.system.mapper;

import com.zyt.system.entity.Log;

import java.util.List;
import java.util.Map;

/**
 * @Classname LogMapper
 * @Description None
 * @Date 2023/12/24 12:23
 * @Created by zyt
 */
public interface LogMapper {
    void insertByLog(Log log);

    List<Log> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int delByLogIds(List<Integer> ids);
}
