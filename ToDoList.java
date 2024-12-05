
import java.util.*;


public class ToDoList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("////***** Welcome to the To-Do List App *******////");
        System.out.println("1: Add Task ");
        System.out.println("2: View Task ");
        System.out.println("3: Mark Task as Completed ");
        System.out.println("4: Delete Task ");
        System.out.println("5: Exit");

        for (int i = 1; i < 10; i++) {

            System.out.print("Enter your choice:");

            int num = scan.nextInt();


            TakeTask newTask = new TakeTask();
            ShowTask data = new ShowTask();
            MarkTask mark = new MarkTask();
            DeleteTask delete = new DeleteTask();

           

            switch (num) {
                case 1:{
                newTask.takeTask();
                    break;
                }
                case 2: {
                    data.showTask();
                    break;
                }
                case 3:{
                    mark.setMarked();
                    break;
                }
                case 4:{
                    delete.deleteTask();
                    break;
                }
                case 5:{
                    System.out.println("GoodBye!!");
               
                break;
                }
                default:{
                    System.out.print("Check Your Choice");
                    
                   
                }
            
            

            

            } 
        }

    }
}

class TakeTask {

    Scanner scan = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<String>();
    static String task;

    static int id = 0;

    
    String takeTask() {
        System.out.println("Enter Task Title:");

        task = scan.nextLine();
        tasks.add(task);

        System.out.println("Task added with ID :" + id);
        id++;

        return task;
    }

}

class ShowTask extends TakeTask {

    // TakeTask newTask = new TakeTask();
    void showTask() {
        // String tasks = TakeTask.tasks;
        // System.out.println(TakeTask.tasks);

        for (int i = 0; i < TakeTask.tasks.size(); i++) {

            System.out.println(i + 



    " " + TakeTask.tasks.get(i));
            
            }

                }
                    
                
}

class MarkTask extends TakeTask {

    void setMarked() {

        // System.out.println(TakeTask.tasks);
        System.out.println("Enter your task id to be Marked:");
        int taskId = scan.nextInt();
        if(taskId <=TakeTask.tasks.size() ){

            System.out.println(taskId + " Task Marked Successfully");

        }
        else{
            System.out.println("Enter Valid ID");
        }

    }
}

class DeleteTask extends TakeTask {

    void deleteTask() {

        System.out.println("Enter  Task id to be Deleted: ");
        int id = scan.nextInt();
        TakeTask.tasks.remove(id);
        System.out.println(id + " Task deleted Successfully. Remaining Tasks ");
        for (int i = 0; i < TakeTask.tasks.size(); i++) {

            System.out.println(i + 



    " " + TakeTask.tasks.get(i));
            
            }

    }

}
