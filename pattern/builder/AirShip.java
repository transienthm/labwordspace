package org.java.bin.pattern.builder;


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
@NoArgsConstructor
class OrbitalModule {
    private String name;

}

@Data
@NoArgsConstructor
class Engine {
    private String name;


}

@Data
@NoArgsConstructor
class EscapeTower {
    private String name;
}
