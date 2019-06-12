package com.shenmingming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shenmingming.mapper.MovieMapper;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年6月11日
 */
@Service
public class Myser implements Ser {
  @Autowired
  private MovieMapper mapper;

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @see com.shenmingming.service.Ser#list(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, int, int, int, int, int)
   */
  @Override
  public List list(String name, String author, String year, String sstart, String send, double pstart,
    String pend, int lstart, int lend, int flag, int timel, int dai) {
    // TODO Auto-generated method stub
    return mapper.list(name, author, year, sstart, send, pstart, pend, lstart, lend, flag, timel, dai);
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @see com.shenmingming.service.Ser#upsj(int)
   */
  @Override
  public void upsj(int id) {
    // TODO Auto-generated method stub
    mapper.upsj(id);
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @see com.shenmingming.service.Ser#upxj(int)
   */
  @Override
  public void upxj(int id) {
    // TODO Auto-generated method stub
    mapper.upxj(id);
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @see com.shenmingming.service.Ser#del(java.lang.String)
   */
  @Override
  public void del(String ids) {
    // TODO Auto-generated method stub
    mapper.del(ids);
  }
}
