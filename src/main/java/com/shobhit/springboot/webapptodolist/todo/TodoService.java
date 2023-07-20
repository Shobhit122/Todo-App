package com.shobhit.springboot.webapptodolist.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService {


    private static List<Todo> todos = new ArrayList<>();
    private static int count=0;

    static{
        todos.add(new Todo(++count,"molu","Learn Snake Charming", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++count,"molu","Learn Dancing with snakes", LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(++count,"molu","Learn thumakna", LocalDate.now().plusMonths(2), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        todos.add(new Todo(++count, username, description, targetDate, done));
    }

    public void delete(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
        todos.removeIf(predicate);

    }

    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
        return todos.stream().filter(predicate).findFirst().get();


    }

    public void updateTodo(Todo todo) {
        delete(todo.getId());
        todos.add(todo);
    }
}
