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
@ApiModel(value = "User Api model documentation", description = "Model")
public class User
{
    @ApiModelProperty(value = "Unique id field of user object")
    private int Id;
    @ApiModelProperty(value = "UserName field of user object")
    private String userName;
    @ApiModelProperty(value = "firstName field of user object")
    private String firstName;
    @ApiModelProperty(value = "lastName field of user object")
    private String lastName;
    @ApiModelProperty(value = "emailAddress field of user object")
    private String emailAddress;
    @ApiModelProperty(value = "Date field of user object")
    private Date date;
}
