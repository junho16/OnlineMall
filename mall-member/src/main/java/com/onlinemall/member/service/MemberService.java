package com.onlinemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 15:19:13
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

