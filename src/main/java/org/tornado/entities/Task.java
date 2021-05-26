package org.tornado.entities;

public class Task {

    private String title;
    private String description;
    private boolean finished;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.finished = false;
    }

    public boolean isFinished() { return this.finished; }
    public String getTitle() { return this.title; }
    public String getDescription() { return this.description; }

    public void finish() {
        this.finished = true;
    }
}