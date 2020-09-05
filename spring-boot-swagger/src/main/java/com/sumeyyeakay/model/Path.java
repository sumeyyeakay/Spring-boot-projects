package com.sumeyyeakay.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Path Api model documentation", description = "Model")
public class Path
{
    @ApiModelProperty(value = "Unique id field of path object")
    private int Id;
    @ApiModelProperty(value = "Name field of path object")
    private String name;
    @ApiModelProperty(value = "Date field of path object")
    private Date date;
}
