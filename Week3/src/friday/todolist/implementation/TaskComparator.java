package friday.todolist.implementation;

import java.util.Comparator;

import friday.todolist.tasks.Task;

public class TaskComparator implements Comparator<Task> {
	// sort tasks by priority first and second by time needed
	@Override
	public int compare(Task task1, Task task2) {
		int compare = task1.getPriority() > task2.getPriority() ? -1 : task1
				.getPriority() < task2.getPriority() ? 1 : 0;
		if (compare == 0) {
			return task1.getTimeNeeded() > task2.getTimeNeeded() ? 1 : task1
					.getTimeNeeded() < task2.getTimeNeeded() ? -1 : 0;
		}
		return compare;
	}
}
