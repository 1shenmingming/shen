package com.shenmingming.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MovieMapper {

  List list(@Param("name") String name, @Param("author") String author, @Param("year") String year,
    @Param("sstart") String sstart, @Param("send") String send, @Param("pstart") double pstart,
    @Param("pend") String pend, @Param("lstart") int lstart, @Param("lend") int lend, @Param("flag") int flag,
    @Param("timel") int timel, @Param("dai") int dai);

  void upsj(int id);

  void upxj(int id);

  void del(String ids);

}
