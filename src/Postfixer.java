import java.util.*;

public class Postfixer {

     Queue<String> numbers = new ArrayDeque<>();
     Deque<String> signs = new ArrayDeque<>();
     private StringBuilder stringBuilder = new StringBuilder();


     public void addToTransform (String[] input) {
          for (int i = 0; i < input.length; i++) {
               if (i % 2 == 0) {
                    numbers.add(input[i]);
               } else {
                    signs.add(input[i]);
               }
          }
     }

     @Override
     public String toString() {
          String output;
          while(!numbers.isEmpty()) {
               stringBuilder.append(numbers.poll() + " ");
          }
          while (!signs.isEmpty()) {
               stringBuilder.append(signs.pollLast() + " ");
          }
          output = stringBuilder.toString();
          return output;
     }
}
