package AssignmentDay4;
//POJO- which contains variables, getter-setter, constructor
public class Task {
	private int TaskId;
	private String TaskTitle;
	private String TaskText;
	private String assignedTo;
	
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public String getTaskTitle() {
		return TaskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		TaskTitle = taskTitle;
	}
	public String getTaskText() {
		return TaskText;
	}
	public void setTaskText(String taskText) {
		TaskText = taskText;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	
	
}
