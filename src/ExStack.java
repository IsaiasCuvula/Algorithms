import java.util.Stack;

public class ExStack {

     public static void main(String[] args) {
        //STACK
       Stack<String> stack = new Stack<String>();
       if(stack.isEmpty()){
         System.out.println("The stack is empty!");
       }

       stack.push("Borderlands");
       stack.push("Minecraft");
       stack.push("Where I am");
       stack.push("DOOM");

       //
       System.out.println(stack);

       String myFavGame = stack.peek();
       String myFavGame2 = stack.pop();

       System.out.println(myFavGame);
       System.out.println(myFavGame2);
       System.out.println("******************");
       System.out.println(stack.search("Minecraft"));
     }
    
}
