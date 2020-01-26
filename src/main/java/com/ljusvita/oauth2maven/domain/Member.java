package com.ljusvita.oauth2maven.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Member {
    Long id;
    String name;
    String userName;
    String remark;
}
