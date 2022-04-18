package com.nb.pojo;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SemMarketShareProblem extends BaseDO{

  private Integer id;
  private Integer skuAnalyseId;
  private Integer allocationId;
  private String problem;
  private String toDoList;
  private Integer isDelete;

}
