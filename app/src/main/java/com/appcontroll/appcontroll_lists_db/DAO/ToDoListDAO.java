package com.appcontroll.appcontroll_lists_db.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.appcontroll.appcontroll_lists_db.Entitys.EntityItemList;
import com.appcontroll.appcontroll_lists_db.Entitys.TodoList;

import java.util.List;

@Dao
public interface ToDoListDAO {

    @Insert
    void insertAll(TodoList todoList);

    @Delete
    void delete(TodoList todoList);

    @Query("SELECT * FROM todolisttb")
    List<TodoList> getAllToDoItems();

    @Query("SELECT * FROM todolisttb WHERE todo_text LIKE :todo_text")
    List<TodoList> getTodoList (String todo_text);
}