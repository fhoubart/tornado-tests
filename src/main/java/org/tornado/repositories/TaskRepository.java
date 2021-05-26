package org.tornado.repositories;

import org.tornado.entities.Task;
import org.tornado.entities.User;

public class TaskRepository {

    public Task[] getUserTasks(User user) throws Exception {
        throw new Exception("La base de donnée n'est pas accessible");
    }
}
