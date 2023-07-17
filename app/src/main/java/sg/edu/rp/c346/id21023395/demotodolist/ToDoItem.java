package sg.edu.rp.c346.id21023395.demotodolist;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) +"/"+ (date.get(Calendar.MONTH) + 1)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        // Complete the code here
        String output = "";
        switch (day){
            case 1:
                output = "Monday";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
        }
        return output;
    }
}
