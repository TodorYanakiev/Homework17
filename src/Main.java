import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static ArrayList<Integer> generateArrayListWithNumbers(int n){
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 5 == 0){
                numbers.add(i);
            }
        }
        return numbers;
    }
    public static void printArrayList (ArrayList list){
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void printReversedArrayList (ArrayList list){
        int size = list.size();
        for (int i = size-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static HashSet generateHashSetWithNumbersUntilZero (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = sc.nextInt();
        HashSet numbers = new HashSet();
        while (n != 0){
            numbers.add(n);
            n = sc.nextInt();
        }
        return numbers;
    }
    public static void printHashSet (HashSet numbers){
        for (Object element : numbers) {
            System.out.print(element + " ");
        }
    }
    public static ArrayList makeTxtFileToArrayListWithOddNumbers (String fileName){
        ArrayList evenNumbers = new ArrayList();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file,"utf-8");
            while(fileReader.hasNext()){
                int n = fileReader.nextInt();
                if (n % 2 == 1){
                    evenNumbers.add(n);
                }
            }
            fileReader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return evenNumbers;
    }
    public static LinkedList makeTxtFileToLinkedListWithOddNumbers (String fileName){
        LinkedList evenNumbers = new LinkedList();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file,"utf-8");
            while(fileReader.hasNext()){
                int n = fileReader.nextInt();
                if (n % 2 == 1){
                    evenNumbers.add(n);
                }
            }
            fileReader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return evenNumbers;
    }
    public static void printLinkedList (LinkedList list){
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static HashSet makeTxtFileToHashSetWithEvenNumbers (String fileName){
        HashSet oddNumbers = new HashSet();
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                int n = reader.nextInt();
                if (n % 2 == 0){
                    oddNumbers.add(n);
                }
            }
            reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return oddNumbers;
    }
    public static void printHashSetAndArrayListInTxtFile(ArrayList list, HashSet set){
        try {
            PrintStream writer = new PrintStream("ArrayList-and-LinkedList-elements.txt");
            int size = list.size();
            writer.println("ArrayList with odd numbers: ");
            for (int i = 0; i < size; i++) {
                writer.print(list.get(i) + " ");
            }
            writer.println();
            writer.println("HashSet with unique even numbers: ");
            for (Object element : set) {
                writer.print(element + " ");
            }
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex1
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        ArrayList<Integer> numbers = generateArrayListWithNumbers(n);
//        printArrayList(numbers);
//        System.out.println();
//        System.out.println("Reversed ArrayList : ");
//        printReversedArrayList(numbers);

        //ex2
//        HashSet numbers = generateHashSetWithNumbersUntilZero();
//        printHashSet(numbers);

        //ex3
//        String fileName = "whole numbers.txt";
//        ArrayList oddNumbers = makeTxtFileToArrayListWithOddNumbers(fileName);
//        System.out.print("Odd numbers: ");
//        printArrayList(oddNumbers);
////        LinkedList oddNumbers = makeTxtFileToLinkedListWithOddNumbers(fileName);
////        System.out.print("Odd numbers: ");
////        printLinkedList(oddNumbers);
////        System.out.println();
//        //Пробвах и с LinkedList, за да видя дали има разлика в бързината. Ще се радвам да кажете, ако знаете.
//        System.out.println();
//        System.out.print("Unique even numbers: ");
//        HashSet evenNumbers = makeTxtFileToHashSetWithEvenNumbers(fileName);
//        printHashSet(evenNumbers);
//        printHashSetAndArrayListInTxtFile(oddNumbers,evenNumbers);
    }
}