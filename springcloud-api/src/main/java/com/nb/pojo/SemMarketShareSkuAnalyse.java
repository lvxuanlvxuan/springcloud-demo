package com.nb.pojo;

import lombok.*;

import java.beans.Transient;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SemMarketShareSkuAnalyse extends BaseDO{

  private Integer id;
  private Integer scheduleDetailId;
  private Integer platform;
  private String site;
  private String groupName;
  private java.sql.Timestamp analyseTime;
  private String skuCode;
  private String skuName;
  private String spuCode;
  private String spuName;
  private Integer productStatus;
  private Integer operationUserId;
  private String operationUserName;
  private String spuPlatformLevel;
  private String productPurchasePrice;
  private String simulateInterestRate;
  private String refundRate;
  private String avgWeek;
  private String turnover;
  private String firstCompetitor;
  private BigDecimal firstCompetitorSales;
  private String firstCompetitorDelivery;
  private BigDecimal firstCompetitorDeliveryTime;
  private BigDecimal commentRate;
  private Integer adClicks;
  private Integer marketShareFirst;
  private Integer skuVerdictId;
  private String skuRemark;
  private Integer groupLeaderConfirmId;
  private String groupLeaderRemark;
  private Integer verdictStatus;
  private Integer isDelete;

  private List<SemMarketShareSkuAnalyseSublist> semMarketShareSkuAnalyseSublists;

  private List<SemMarketShareProblem> semMarketShareProblems;

}
