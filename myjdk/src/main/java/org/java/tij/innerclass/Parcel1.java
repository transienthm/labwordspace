package org.java.tij.innerclass;

public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
    }
}
