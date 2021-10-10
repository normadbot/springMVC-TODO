package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	private String todoTitle;
	private String todocontent;
	private Date todoDate;

	public Todo(String todoTitle, String todocontent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todocontent = todocontent;
		this.todoDate = todoDate;
	}

	public Todo() {

	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodocontent() {
		return todocontent;
	}

	public void setTodocontent(String todocontent) {
		this.todocontent = todocontent;
	}

	public Date getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

	@Override
	public String toString() {
		return "Todo [todoTitle=" + todoTitle + ", todocontent=" + todocontent + ", todoDate=" + todoDate + "]";
	}

}
