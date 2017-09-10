package org.java.bin.pattern.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wangbin on 2017/1/25.
 */
@Data
@NoArgsConstructor
public class AirShip {
    private OrbitalModule orbitalModule;
    private Engine engine;
    private EscapeTower escapeTower;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class OrbitalModule {
    private String name;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Engine {
    private String name;
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class EscapeTower {
    private String name;
}
