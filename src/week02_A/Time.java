package week02_A;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    //no return type
    //name of class and constructor name are identical

    Time(int hours, int minutes, int seconds){
      //  this.hours=hours;
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
            }


    public void setHours(int hours){
        if(hours>=0 && hours<=23)
            this.hours=hours;
    }
    public  int getHours(){
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes>=0&&minutes<=59)
        this.minutes = minutes;
    }

    public int getSeconds() {

        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds>=0&&seconds<=59)
        this.seconds = seconds;
    }

    public String getUniversalTime(){
        return String.format("%02d:%02d:%02d %2s",hours,minutes,seconds,hours>12?"AM":"PM");
//        return hours+":"+minutes+":"+seconds;
    }
}
