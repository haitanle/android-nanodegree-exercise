package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Database;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// done (1) make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {

    // done (2) Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData
    private LiveData<List<TaskEntry>> tasks;

    // done (3) Create a getter for the tasks variable
    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }

    public MainViewModel(@NonNull Application application) {
        // done (4) In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable
        super(application);
        AppDatabase appDatabase = AppDatabase.getInstance(this.getApplication());
        tasks = appDatabase.taskDao().loadAllTasks();
    }

}
