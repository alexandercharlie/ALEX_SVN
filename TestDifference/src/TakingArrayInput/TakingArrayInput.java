/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TakingArrayInput;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class TakingArrayInput {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);

        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
    }
}