import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList todo = new TodoList();
        String d;
        boolean flag = true;
        while (flag) {
            String input = sc.nextLine();
            switch (input) {
                case "LIST":
                    todo.getTodos();
                    break;
                case "ADD":
                    System.out.println("Введите дело, а затем его индекс через пробел (если нужно вставить в конец - введите только дело)");
                    d = sc.nextLine();
                    if (d.split(" ").length > 1) todo.add(Integer.parseInt(d.split(" ")[1]), d.split(" ")[0]);
                    else todo.add(d);
                    break;
                case "EDIT":
                    System.out.println("Введите дело, а затем индекс заменяемого через пробел.");
                    d = sc.nextLine();
                    todo.edit(d.split(" ")[0], Integer.parseInt(d.split(" ")[1]));
                    break;
                case "DELETE":
                    System.out.println("Введите индекс удаляемого дела");
                    d = sc.nextLine();
                    todo.delete(Integer.parseInt(d));
                    break;
                default:
                    break;
            }
        }
    }
}


public class TodoList {
    List<String> todoList = new ArrayList<>();

    public static void main(String[] args) {

    }


    public void add(String todo) {
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        todoList.add(index, todo);
    }

    public void edit(String todo, int index) {
        todoList.remove(index);
        todoList.add(index, todo);
    }

    public void delete(int index) {
//         TODO: удалить дело находящееся по переданному индексу,
//          проверьте возможность удаления дела
        try {
            todoList.remove(index);
        } catch (Exception e) {
            System.out.println("Не существует такого дела");
        }
    }

    public ArrayList<String> getTodos() {
        return (ArrayList<String>) todoList;
    }
}