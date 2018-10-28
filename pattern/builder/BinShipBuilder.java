package org.java.bin.pattern.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wangbin on 2017/1/25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinShipBuilder implements AirShipBuilder{
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("斌斌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道仓");
        return new OrbitalModule("斌斌轨道仓");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("斌斌逃逸塔");
    }
}
