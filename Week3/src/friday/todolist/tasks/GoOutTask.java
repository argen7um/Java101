package friday.todolist.tasks;

public class GoOutTask extends Task {

	public GoOutTask(int priority, float timeNeeded) {
		super(priority, timeNeeded);
	}

	@Override
	public String toString() {
		return "Go out Task [ time needed: "
				+ String.valueOf(super.getTimeNeeded()) + " priority: "
				+ super.getPriority() + " ]";
	}
}
