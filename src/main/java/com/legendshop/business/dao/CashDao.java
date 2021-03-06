package com.legendshop.business.dao;

import com.legendshop.core.dao.BaseDao;
import com.legendshop.core.dao.support.CriteriaQuery;
import com.legendshop.core.dao.support.PageSupport;
import com.legendshop.model.entity.Cash;
import java.util.List;

public abstract interface CashDao extends BaseDao
{
  public abstract List<Cash> getCash(String paramString);

  public abstract Cash getCash(Long paramLong);

  public abstract void deleteCash(Cash paramCash);

  public abstract Long saveCash(Cash paramCash);

  public abstract void updateCash(Cash paramCash);

  public abstract PageSupport getCash(CriteriaQuery paramCriteriaQuery);
}