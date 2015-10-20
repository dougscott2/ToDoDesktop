package sample;

/**
 * Created by DrScott on 10/20/15.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }
    public String toString(){
        String done = "";
        if (isDone){
            done = "[X] done";
        } else { done = "[ ] it ain't done";}
        return String.format("%s %s", text, done);
    }
}
