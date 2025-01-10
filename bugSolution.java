public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 4) { // Check that index is within bounds
            System.out.println(arr[4]); // Accessing the last valid element
        }
    }
}