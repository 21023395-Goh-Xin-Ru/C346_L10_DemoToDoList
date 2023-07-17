package sg.edu.rp.c346.id21023395.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ToDoItem> toDoList;
    CustomAdapter aaTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        toDoList = new ArrayList<>();

        Calendar item1Date = Calendar.getInstance();
        item1Date.set(2020,7,1);
        Calendar item2Date = Calendar.getInstance();
        item2Date.set(2020,7,2);

        ToDoItem item1 = new ToDoItem("Go for movie", item1Date);
        ToDoItem item2 = new ToDoItem("Go for haircut", item2Date);

        toDoList.add(item1);
        toDoList.add(item2);

        aaTodo = new CustomAdapter(this,
                R.layout.row, toDoList);

        lv.setAdapter(aaTodo);
    }
}