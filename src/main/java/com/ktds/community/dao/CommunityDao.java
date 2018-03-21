package com.ktds.community.dao;

import java.util.List;

import com.ktds.community.vo.CommunityVO;

public interface CommunityDao {

	public List<CommunityVO> selectAll();
	
	public int insertCommunity(CommunityVO communityVO);
	
	public CommunityVO selectOne(int id);
	
	public List<CommunityVO> selectMyCommunities(int userId);

	public int incrementViewCount(int id);
	
	public int incrementRCount(int id);

	public int deleteOne(int id);
	
	public int deleteMyCommunities(int userId);
	
	public int deleteCommunities(List<Integer> ids, int userId);
	
	public int updateCommunity(CommunityVO communityVO); 
	
	public int selectMyCommunitiesCount(int userId);
	
}
