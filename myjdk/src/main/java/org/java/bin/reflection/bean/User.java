package org.java.bin.reflection.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wangbin on 17/1/21.
 */
@Data
@NoArgsConstructor
public class User {
    private long id;
    private int age;
    private String uname;
}
