package org.java.bin.pattern.builder;

/**
 * Created by wangbin on 2017/1/25.
 */
public interface AirShipBuilder {
    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();
}
