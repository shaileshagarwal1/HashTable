
//Implementing Thread safe 1:n association of Workspace and Task

public class TaskWorkSpace {

  public static final class Task {
    private Workspace workspace;

    public synchronized Workspace getWorkspace() {
      return workspace;
    }

    synchronized void setWorkspace(Workspace workspace) {
      this.workspace = workspace;
    }
  }

 
  public static final class Workspace {

    private final Set<Task> tasks = new TreeSet<Task>();

    public void addTask(Task t) {
      synchronized (t) {
        final Workspace old = t.getWorkspace();

        if (old != this) {
          if (old != null) {
            old.removeTask(t);
          }

          assert t.getWorkspace() == null;

          synchronized (tasks) {
            tasks.add(t);
            t.setWorkspace(this);
          }
        }
      }
    }

    public void removeTask(Task t) {
      synchronized (t) {
        final Workspace old = t.getWorkspace();

        if (old != this) {
          throw new IllegalStateException("Not owner");
        }

        synchronized (tasks) {
          tasks.remove(t);
          t.setWorkspace(null);
        }
      }
    }
    
    //list contains List of task
    public void removeTaskList(List<Task> list) {
      synchronized (list) {
      for(Task t: list)
        removeTask(t);
      }
    }
    
   //taskIndex starts from 1
    public void removeTaskByIndex(List<Integer> taskIndex) {
      synchronized (taskIndex) {
      for(Integer i: taskIndex)
        tasks.remove(taskIndex-1);
      }
    }

   
    public Set<Task> getTasks() {
        return tasks;
    }

   
    public boolean hasTasks() {
      synchronized (tasks) {
        return !tasks.isEmpty();
      }
    }

  }

}
