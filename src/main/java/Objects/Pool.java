package Objects;

public class Pool {

            // variables referred to as fields
            private String name;
            private double length;
            private boolean isInside;

            // constructor
            Pool (String name, double length, boolean isInside){
                this.name = name;
                this.length = length;
                this.isInside = isInside;
            }

            public double distanceForLaps(int laps){
                return laps * length;
            }

            public boolean caSwimInWinter(){

                return isInside;
            }



            @Override
            public String toString(){

                //       variable     if true     inside  else  outside
                String insideString = isInside ? "inside" : "outside";

//                int temp = 34;
//                String isHot = temp > 70 ? "hot" : "cold";

                return name + " pool is " + length + " meters long." + insideString;
            }


}
