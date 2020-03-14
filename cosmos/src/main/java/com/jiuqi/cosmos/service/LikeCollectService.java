package com.jiuqi.cosmos.service;

import java.util.List;

import com.jiuqi.cosmos.pojo.LikeCollectDTO;
import com.jiuqi.cosmos.pojo.UserInfoDTO;

public interface LikeCollectService {
	  
	/**
	 * 定时，将数据从redis中存到mysql中。
	 */
	public void transLikeFromRedis2DB();
	
	public void transCollectFromRedis2DB();
	
	
//	从数据库中获取某一篇博客的点赞收藏的用户列表
	public List<UserInfoDTO> getLikedByBlogId(Integer blogId);
	public List<UserInfoDTO> getCollectedByBlogId(Integer blogId);
	/**
	 * likeCollectDTO信息处理后存到redis中
	 * @param likeCollectDTO
	 * @return
	 */
	public boolean likeToblogToRedis(LikeCollectDTO likeCollectDTO);
	/**
	 * likeCollectDTO信息处理后存到redis中，取消点赞，数量-1
	 * @param likeCollectDTO
	 * @return
	 */
	public boolean unlikeToblogToRedis(LikeCollectDTO likeCollectDTO);
	
}
