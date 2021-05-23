package md.tekwill.task;

import java.util.Arrays;

class TaskStorage {

    private Task[] allTasks = new Task[0];

    public Task[] findAll() {
        return allTasks;
    }

    public Task findById(int id) {
        Task task = null;
        for (Task allTask : allTasks) {
            if (allTask.getId() == id) {
                task = allTask;
                break;
            }
        }
        return task;
    }

    public void create(Task task) {
        Task[] extendedCopyOfTasks = Arrays.copyOf(allTasks, allTasks.length + 1);
        extendedCopyOfTasks[extendedCopyOfTasks.length - 1] = task;
        allTasks = extendedCopyOfTasks;
    }

    public void removeById(int id) {
        int index = -1;
        for (int i = 0; i < allTasks.length; i++) {
            if (allTasks[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            removeFromAllTasksByIndex(index);
        }
    }

    private void removeFromAllTasksByIndex(int index) {
        allTasks[index] = null;
        for (int i = index; i < allTasks.length - 1; i++) {
            allTasks[i] = allTasks[i + 1];
        }
        allTasks = Arrays.copyOf(allTasks, allTasks.length - 1);
    }
}
