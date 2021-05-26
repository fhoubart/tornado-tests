package org.tornado.entities.repositories;

import org.tornado.entities.Task;

public class TaskRepository {

    public Task[] getUserTasks(User user) {
        throw new Exception("La base de donnée n'est pas accessible");
    }
}
