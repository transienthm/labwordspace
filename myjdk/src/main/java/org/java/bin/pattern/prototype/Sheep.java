package org.java.bin.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * Created by wangbin on 2017/1/25.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sheep implements Cloneable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}
