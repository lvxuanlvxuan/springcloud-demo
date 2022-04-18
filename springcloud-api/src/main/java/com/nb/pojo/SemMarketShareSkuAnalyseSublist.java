package com.nb.pojo;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SemMarketShareSkuAnalyseSublist extends BaseDO{

  private Integer id;
  private Integer skuAnalyseId;
  private String channelitem;
  private String channelSku;
  private BigDecimal realitySales;
  private BigDecimal editSales;
  private Integer isEdit;
  private BigDecimal salePrice;
  private BigDecimal starLevel;
  private Integer commentCount;
  private String url;
  private Integer isDelete;

}
