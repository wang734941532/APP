package cn.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.app.dao.Dev_UserMapper;
import cn.app.pojo.Dev_User;
@Service("dev_UserService")
public class Dev_UserServiceImpl implements Dev_UserService {

	@Autowired
	private Dev_UserMapper dev_UserMapper;
	
	
	
	public void setDev_UserMapper(Dev_UserMapper dev_UserMapper) {
		this.dev_UserMapper = dev_UserMapper;
	}

	@Override
	public Dev_User login(String userCode, String userPassword) {
		Dev_User duser = null;
		try {
		String devCode = userCode;
	 	duser  = dev_UserMapper.getLoginUser(devCode);
	 	System.out.println("usermapper获得的User"+duser);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(null!=duser) {
			System.out.println(duser);
			System.out.println(duser.getDevpassword());
			if(!duser.getDevpassword().equals(userPassword)) {
				duser=null;
			}
		}
		return duser;
	}

}
