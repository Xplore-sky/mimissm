package com.zcm.service.impl;

import com.zcm.mapper.AdminMapper;
import com.zcm.pojo.Admin;
import com.zcm.pojo.AdminExample;
import com.zcm.service.AdminService;
import com.zcm.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//对象注入创建交给spring
@Service
public class AdminServiceImpl implements AdminService {

    //在业务逻辑层一定有数据访问层的对象
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {

        //根据传入的用户名或到db中查询相应用户对象
        //如果有条件，则一定要创建adminexample的对象，用来封装条件
        AdminExample example = new AdminExample();
        //添加用户名a_name条件
        example.createCriteria().andANameEqualTo(name);

        List<Admin> list = adminMapper.selectByExample(example);
        if (list.size()>0){
            Admin admin = list.get(0);
            //如果查询到用户对象，在进行密码比对,注意密码是密文的
            /*分析
            * admin.getApass==>cdasassadsadsadadasdasdsa
            * pwd=>000000
            *在进行密码对比时，要讲传入的pwd进行md5加密。再与数据库中查到对象的密码进行对比
            */
            String miPwd = MD5Util.getMD5(pwd);
            if (miPwd.equals(admin.getaPass())){
                return admin;
            }
        }
        return null;
    }
}
