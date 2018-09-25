package Overloading;
// https://www.youtube.com/watch?v=WqQsuIW2CFE n.3.46-4h

public class OverloadingEka {

    private int hour,minute,second;

    public OverloadingEka(){
        this(0,0,0);
    }
    public OverloadingEka(int h){
        this(h,0,0);
    }
    public OverloadingEka(int h, int m){
        this(h,m,0);
    }
    public OverloadingEka(int h, int m, int s){
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h<24)?h:0);
        minute = ((m>=0 && m<60)?m:0);
        second = ((s>=0 && s<60)?s:0);
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }





//    private int hour;
//    private int minute;
//    private int second;
//
//    public OverloadingEka(){
//        this(0,0,0);
//    }
//    public OverloadingEka(int h){
//        this(h,0,0);
//    }
//    public OverloadingEka(int h, int m){
//        this(h,m,0);
//    }
//    public OverloadingEka(int h, int m, int s){
//        setTime(h,0,0);
//    }
//    public void setTime(int h, int m, int s){
//        setHour(h);
//        setMinute(m);
//        setSecond(s);
//
//    }
//    public void setHour(int h){
//        //if statement, chekkaa onko 0-24 älissä ja jos ei ole niin käyttää 0
//        hour = ((h>=0&&h<24)?h:0);
//    }
//    public void setMinute(int m){
//        minute = ((m>=0&&m<60)?m:0);
//    }
//    public void setSecond(int s){
//        second = ((s>=0&&s<60)?s:0);
//    }
//    public int getHour(){
//        return hour;
//    }
//    public int getMinute(){
//        return minute;
//    }
//    public int getSecond(){
//        return second;
//    }
//    public String toMilitary(){
//        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
//    }
}
