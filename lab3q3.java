//Collection In java Implementation with Classes

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class lab3q3 {
    Scanner sc = new Scanner(System.in);

    // ArrayList Implementation
    void ArrayListImplementation() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        // Add Elements to ArrayList
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        // Remove an Element from a Specific Idx
        System.out.println("Enter the idx to  remove Element: ");
        int idx = sc.nextInt();
        arr.remove(idx);
        // Display ArrayList
        System.out.println("Updated ArrayList: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        // Size of ArrayList
        System.out.println("\nSize of ArrayList: " + arr.size());
        // Iterate through ArrayList and print elements
        System.out.println("Iterating through ArrayList: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        // Clear ArrayList
        arr.clear();
        System.out.println("\nSize of ArrayList after clearing: " + arr.size());
    }

    // HashMap Implementation
    void hashMapImplementation() {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        int n = sc.nextInt();
        // Add Elements to HashMap
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            map.put(i, sc.next());
        }
        // Remove an Element from a Specific Idx
        System.out.println("Enter the idx to  remove Element: ");
        int idx = sc.nextInt();
        map.remove(idx);
        // Display HashMap
        System.out.println("Updated HashMap: ");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
        // Size of HashMap
        System.out.println("\nSize of HashMap: " + map.size());
        // Iterate through HashMap and print elements
        System.out.println("Iterating through HashMap: ");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
        // Clear HashMap
        map.clear();
        System.out.println("\nSize of HashMap after clearing: " + map.size());

    }

    // Linked List Implementation
    void linkedListImplementation() {

        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = sc.nextInt();
        // Add Elements to LinkedList
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // Remove an Element from a Specific Idx
        System.out.println("Enter the idx to  remove Element: ");
        int idx = sc.nextInt();
        list.remove(idx);
        // Display LinkedList
        System.out.println("Updated LinkedList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Size of LinkedList
        System.out.println("\nSize of LinkedList: " + list.size());
        // Iterate through LinkedList and print elements
        System.out.println("Iterating through LinkedList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Clear LinkedList
        list.clear();
        System.out.println("\nSize of LinkedList after clearing: " + list.size());

    }

    // Stack Implementation
    void stackImplementation() {
        Stack<Integer> stack = new Stack<Integer>();
        int n = sc.nextInt();
        // Add Elements to Stack
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        // Remove an Element from a Specific Idx
        System.out.println("Enter the idx to  remove Element: ");
        int idx = sc.nextInt();
        stack.remove(idx);
        // Display Stack
        System.out.println("Updated Stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
        // Size of Stack
        System.out.println("\nSize of Stack: " + stack.size());
        // Iterate through Stack and print elements
        System.out.println("Iterating through Stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
        // Clear Stack
        stack.clear();
        System.out.println("\nSize of Stack after clearing: " + stack.size());
    }

    // Queue Implementation
    void queueImplementation() {
        ArrayList<Integer> queue = new ArrayList<Integer>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        // Add Elements to Queue
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        // Remove an Element from a Specific Idx
        System.out.println("Enter the idx to  remove Element: ");
        int idx = sc.nextInt();
        queue.remove(idx);
        // Display Queue
        System.out.println("Updated Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
        // Size of Queue
        System.out.println("\nSize of Queue: " + queue.size());
        // Iterate through Queue and print elements
        System.out.println("Iterating through Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
        // Clear Queue
        queue.clear();
        System.out.println("\nSize of Queue after clearing: " + queue.size());

    }

    // Sort ArrayList
    void SortArrayList(ArrayList<Integer> arr) {
        Collections.sort(arr);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Choice: ");
        System.out.println("1. ArrayList Implementation");
        System.out.println("2. HashMap Implementation");
        System.out.println("3. LinkedList Implementation");
        System.out.println("4. Stack Implementation");
        System.out.println("5. Queue Implementation");
        System.out.println("6. Sort ArrayList");
        lab3q3 obj = new lab3q3();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Choice: ");

            int choice = sc.nextInt();
            if (choice == 1) {
                obj.ArrayListImplementation();
            } else if (choice == 2) {
                obj.hashMapImplementation();
            } else if (choice == 3) {
                obj.linkedListImplementation();
            } else if (choice == 4) {
                obj.stackImplementation();
            } else if (choice == 5) {
                obj.queueImplementation();
            } else if (choice == 6) {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                System.out.println("Enter the number of elements: ");
                int n = sc.nextInt();
                System.out.println("Enter " + n + " elements: ");
                for (int i = 0; i < n; i++) {
                    arr.add(sc.nextInt());
                }
                obj.SortArrayList(arr);
                System.out.println("Sorted ArrayList: ");
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Invalid Choice");
                break;
            }
            System.clearProperty("cls");
        }

    }
}