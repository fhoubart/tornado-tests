package org.tornado.services;

import org.tornado.entities.Task;
import org.tornado.entities.User;
import org.tornado.repositories.TaskRepository;

public class TaskService {

    // Prbleme : comment mocker cette dépendance pour les tests ??
    private TaskRepository taskRepo = new TaskRepository();

    public int getNumberOfActiveTasks(User user) throws Exception {
        Task[] tasks = taskRepo.getUserTasks(user);
        int nb = 0;
        for(Task t: tasks) {
            if(!t.isFinished()) nb++;
        }
        return nb;
    }

}