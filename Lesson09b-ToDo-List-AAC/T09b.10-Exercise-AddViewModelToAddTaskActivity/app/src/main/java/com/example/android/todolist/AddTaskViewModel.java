package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// done (5) Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel {

    // done (6) Add a task member variable for the TaskEntry object wrapped in a LiveData
    private LiveData<TaskEntry> mTaskEntry;

    // done (8) Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable
    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase mDb, int taskId) {
        this.mTaskEntry = mDb.taskDao().loadTaskById(taskId);
    }

    // done (7) Create a getter for the task variable
    public LiveData<TaskEntry> getTask() {
        return mTaskEntry;
    }
}
