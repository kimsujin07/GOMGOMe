package com.ezen.gomgome.service.community;

import java.util.List;

import com.ezen.gomgome.common.CamelHashMap;
import com.ezen.gomgome.entity.Community;

public interface CommunityService {

	List<CamelHashMap> getSearchCommunityList(Community community);
}
