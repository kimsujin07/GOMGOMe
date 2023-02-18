package com.ezen.gomgome.service.community.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.gomgome.common.CamelHashMap;
import com.ezen.gomgome.entity.Community;
import com.ezen.gomgome.repository.CommunityRepository;
import com.ezen.gomgome.service.community.CommunityService;

@Service
public class CommunityServiceImpl implements CommunityService {
	@Autowired
	private CommunityRepository communityRepository;

	@Override
	public List<CamelHashMap> getSearchCommunityList(Community community) {
		// TODO Auto-generated method stub
		return communityRepository.getSearchCommunityList(community.getSearchKeyword());
	}
	
}
