package com.shenmingming.service;

import java.util.List;

public interface Ser {

  List list(String name, String author, String year, String sstart, String send, double pstart, String pend,
    int lstart, int lend, int flag, int timel, int dai);

  void upsj(int id);

  void upxj(int id);

  void del(String ids);

}
