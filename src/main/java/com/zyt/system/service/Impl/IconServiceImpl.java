package com.zyt.system.service.Impl;

import com.zyt.system.entity.Icon;
import com.zyt.system.mapper.IconMapper;
import com.zyt.system.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname IconServiceImpl
 * @Description None
 * @Date 2023/12/22 11:19
 * @Created by zyt
 */
@Service
public class IconServiceImpl implements IconService {

    @Autowired
    private IconMapper iconMapper;

    @Override
    public List<Icon> selectAll() {
        return iconMapper.selectAll();
    }
}
