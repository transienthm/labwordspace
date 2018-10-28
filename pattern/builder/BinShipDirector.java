package org.java.bin.pattern.builder;



/**
 * Created by wangbin on 2017/1/25.
 */

public class BinShipDirector implements AirShipDirector {

    public AirShipDirector getAirShipDirector() {
        return airShipDirector;
    }

    public void setAirShipDirector(AirShipDirector airShipDirector) {
        this.airShipDirector = airShipDirector;
    }

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
