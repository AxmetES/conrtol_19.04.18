package com.appcontroll.appcontroll_lists_db.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.os.Bundle;

import com.appcontroll.appcontroll_lists_db.Entitys.EntityItemList;
import com.appcontroll.appcontroll_lists_db.Entitys.ListWithToDo;
import com.appcontroll.appcontroll_lists_db.Entitys.TodoList;

import java.util.Date;
import java.util.List;

@Dao
public interface ToDoListDAO {

    @Insert
    void insertAll(TodoList todoList);

    @Delete
    void delete(TodoList todoList);

    @Query("SELECT * FROM listnametb")
    public List<EntityItemList> getlistnametb();

    @Query("SELECT * FROM todolisttb ORDER BY todo_date")
    public List<TodoList> getDate();

    @Query("SELECT * from todolisttb where ownerId = :list_name")
    public List<TodoList> fromToDoByOwnerId(String list_name);


}

