public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public String toString(){
        return this.hour+":"+this.minute+":"+this.second;
    }

    public MyTime nextSecond(){
        this.second += 1;
        if (this.second == 60){
            this.second = 0;
            this.minute += 1;
        }
        if (this.minute == 60){
            this.minute = 0;
            this.hour += 1;
        }

        if (this.hour == 24){
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
        return this;
    }

    public MyTime nextMinute(){
        this.minute += 1;
        if (this.minute == 60){
            this.minute = 0;
            this.hour += 1;
        }

        if (this.hour == 24){
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
        return this;
    }

    public MyTime nextHour(){
        this.hour += 1;
        if (this.hour == 24){
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond(){
        this.second -= 1;
        if (this.second == -1){
            this.second = 59;
            this.minute -= 1;
        }
        if (this.minute == -1){
            this.minute = 59;
            this.hour -= 1;
        }

        if (this.hour == -1){
            this.hour = 23;
        }
        return this;
    }

    public MyTime previousMinute(){
        this.minute -= 1;
        if (this.minute == -1){
            this.minute = 59;
            this.hour -= 1;
        }

        if (this.hour == -1){
            this.hour = 23;
        }
        return this;
    }

    public MyTime previousHour(){
        this.hour -= 1;
        if (this.hour == -1){
            this.hour = 23;
        }
        return this;
    }


}
