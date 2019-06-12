package com.shenmingming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenmingming.service.Ser;
import com.shenmingming.utils.Page;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年6月11日
 */
@Controller
public class Mycontroller {
  @Autowired
  private Ser ms;

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @param model
   * @param pageNum
   * @param name
   * @param author
   * @param year
   * @param sstart
   * @param send
   * @param pstart
   * @param pend
   * @param lstart
   * @param lend
   * @param flag
   * @param timel
   * @param dai
   * @return
   */
  //sdaas
  @RequestMapping("list")
  public String list(Model model, @RequestParam(defaultValue = "1") int pageNum,
    @RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String author,
    @RequestParam(defaultValue = "0") String year, @RequestParam(defaultValue = "1991-01-01") String sstart,
    @RequestParam(defaultValue = "2020-01-01") String send, @RequestParam(defaultValue = "0") double pstart,
    @RequestParam(defaultValue = "99999") String pend, @RequestParam(defaultValue = "0") int lstart,
    @RequestParam(defaultValue = "999") int lend, @RequestParam(defaultValue = "3") int flag,
    @RequestParam(defaultValue = "3") int timel, @RequestParam(defaultValue = "3") int dai) {
    PageHelper.startPage(pageNum, 3);
    List list = ms.list(name, author, year, sstart, send, pstart, pend, lstart, lend, flag, timel, dai);
    PageInfo info = new PageInfo(list);
    String url = "&name=" + name + "&author=" + author + "&year=" + year + "&sstart=" + sstart + "&send="
      + send + "&pstart=" + pstart + "&pend=" + pend + "&lstart=" + lstart + "&lend=" + lend + "&flag=" + flag
      + "&dai=" + dai + "&timel=" + timel;
    Page.fenye(model, info, url);
    model.addAttribute("list", list);
    model.addAttribute("flag", flag);
    model.addAttribute("timel", timel);
    model.addAttribute("dai", dai);
    model.addAttribute("lstart", lstart);
    model.addAttribute("lend", lend);
    return "list";
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @param id
   * @return
   */
  @RequestMapping("upsj")
  @ResponseBody
  public boolean upsj(int id) {
    ms.upsj(id);
    return true;
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @param id
   * @return
   */
  @RequestMapping("upxj")
  @ResponseBody
  public boolean upxj(int id) {
    ms.upxj(id);
    return true;
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年6月11日
   * @param ids
   * @return
   */
  @RequestMapping("del")
  @ResponseBody
  public boolean del(String ids) {
    ms.del(ids);
    return true;
  }
}
