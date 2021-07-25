public class Main {
    // Driver method
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Insertion Sort");
        System.out.println("--------------------");
        int arr_insertion[] = { 12, 11, 13, 5, 6 };
        InsertionSort ob = new InsertionSort();
        System.out.println("Given Array:");
        ob.printArray(arr_insertion);
        ob.sort(arr_insertion);
        System.out.println("Sorted Array:");
        ob.printArray(arr_insertion);
        System.out.println();        
    }
}