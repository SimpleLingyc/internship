package com.cyl.court.control.core;

import com.cyl.court.model.ArticleNodeContextModel;
import com.cyl.court.model.ArticleNodeModel;

public interface ArticleFilter {
  //对重新抽象出的内容结点 进行一层层过滤 最终的到想要的格式
  void doFilter(ArticleNodeContextModel articleNode);

}
