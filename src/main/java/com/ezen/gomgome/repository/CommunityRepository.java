package com.ezen.gomgome.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ezen.gomgome.common.CamelHashMap;
import com.ezen.gomgome.entity.Community;

@Transactional															//PK
public interface CommunityRepository extends JpaRepository<Community, Integer>{
	
	
	@Query(value="SELECT *\r\n"
			+ "	FROM (\r\n"
			+ "			SELECT A.*\r\n"
			+ "				 , B.USER_NICKNAME\r\n"
			+ "				FROM T_GOMG_COMMUNITY A\r\n"
			+ "				   , T_GOMG_USER B\r\n"
			+ "				WHERE A.USER_ID = B.USER_ID\r\n"
			+ "		 ) C\r\n"
			+ "	WHERE 1 = 0    \r\n"
			+ "      OR C.COMMUNITY_CONTENT LIKE CONCAT('%', :searchKeyword, '%')\r\n"
			+ "      OR C.COMMUNITY_TITLE LIKE CONCAT('%', :searchKeyword, '%')", nativeQuery = true)
	List<CamelHashMap> getSearchCommunityList(@Param("searchKeyword") String searchKeyword);
	
}
