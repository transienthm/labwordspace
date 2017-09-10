package org.java.bin.pattern.builder;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by wangbin on 2017/1/25.
 */
@RequiredArgsConstructor
@ToString
public class BinShipDirector implements AirShipDirector {

    private AirShipDirector airShipDirector;

    @Override
    public AirShip directAirShip() {
        return null;
    }

    public static void main(String[] args) {
        AirShipDirector airShipDirector = new BinShipDirector();
        System.out.println(airShipDirector.toString());
    }
}
