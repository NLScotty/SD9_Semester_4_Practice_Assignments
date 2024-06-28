public class Task {
    String description;
    boolean complete;

    public Task(String description){
        this.description = description;
    }
    public Task(String description, boolean complete){
        this.description = description;
        this.complete = complete;
    }

    public String getContent() {
        return description;
    }
    public void setContent(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
