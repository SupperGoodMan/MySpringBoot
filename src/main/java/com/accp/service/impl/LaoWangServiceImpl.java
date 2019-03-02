package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.LaoWangMapper;
import com.accp.domain.LaoWang;
import com.accp.service.LaoWangServicec;

@Service
public class LaoWangServiceImpl implements LaoWangServicec{

	@Autowired
	LaoWangMapper laowang;
	
	public List<LaoWang> query(){
		return laowang.selectByExample(null);
	}
	
}
