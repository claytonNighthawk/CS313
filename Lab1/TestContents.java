import java.util.Scanner;

public class TestContents{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Queue<Character> queue = new Queue<Character>();
        Stack<Character> stack = new Stack<Character>();
        while (scan.hasNext()){
            String input = scan.nextLine();
            for(int i = 0; i < input.length(); i++){
                queue.enqueue(input.charAt(i));
                stack.push(input.charAt(i));
            }
            System.out.println("Stack Output: ");
            stack.printStack();
            System.out.println("Queue Output: ");
            queue.printQueue();
        }
        scan.close();
    }
}