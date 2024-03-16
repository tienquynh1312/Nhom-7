package com.mycompany.week3;

public class DisruptLecture {
    public class CellPhone {
        void cellPhone() {
        }

        public void ring(Tune t) {
            t.play();
        }
    }

    public class Tune {
        public void play() {
            System.out.println("Tune.play()");
        }
    }

    public class ObnoxiousTune extends Tune {
        public ObnoxiousTune() {
        }
    }
}
