package com.cyl.court.control.core;

import com.cyl.court.model.ArticleNodeContextModel;
import com.cyl.court.model.ArticleNodeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//整合所有的过滤器形成过滤器链
public class FilterChain implements ArticleFilter {

  List<ArticleFilter> articleFilters = new ArrayList<>();

  public FilterChain addFilter(ArticleFilter filter) {
    articleFilters.add(filter);
    return this;
  }

  private int index = -1;

  @Override
  public void doFilter(ArticleNodeContextModel articleNode) {

    for (ArticleFilter articleFilter : articleFilters) {
      articleFilter.doFilter(articleNode);
    }

  }




}
