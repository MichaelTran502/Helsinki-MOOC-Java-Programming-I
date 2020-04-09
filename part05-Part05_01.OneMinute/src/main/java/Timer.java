/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Timer {
    
    private int seconds = 0;
    private int hundredths = 0;
    
    public void advance() {
        this.hundredths++;
        
        if (this.hundredths == 100) {
            this.seconds++;
            this.hundredths = 0;
        }
        
        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }
    
    @Override
    public String toString() {
        String time = "";
        
        if (this.seconds < 10 && this.hundredths < 10) {
            time = "0" + this.seconds + ":0" + this.hundredths;
        } else if (this.seconds < 10) {
            time = "0" + this.seconds + ":" + this.hundredths;
        } else if (this.hundredths < 10) {
            time = this.seconds + ":0" + this.hundredths;
        } else {
            time = this.seconds + ":" + this.hundredths;
        }
        
        
        return time;
    }
}
