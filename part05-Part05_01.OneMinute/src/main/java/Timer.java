/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bileg
 */
public class Timer {

    private int miliSecond;
    private int seconds;

    public Timer() {
        this.miliSecond = 0;
        this.seconds = 0;
    }

    public void advance() {
        this.miliSecond++;
        if (this.miliSecond == 100) {
            this.miliSecond = 0;
            this.seconds++;

            if (seconds == 60) {
                this.seconds = 0;
            }
        }
    }

    @Override
    public String toString() {

        if (this.seconds < 10 && this.miliSecond < 10) {
            return "0" + this.seconds + ":" + "0" + this.miliSecond;
        }
        if (this.seconds < 10) {
            return "0" + this.seconds + ":" + this.miliSecond;
        }
        if (this.miliSecond < 10) {
            return this.seconds + ":" + "0" + this.miliSecond;

        } else {
            return this.seconds + ":" + this.miliSecond;
        }

    }
}
