import java.util.*;

class Sample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read size of first array
        int n1 = s.nextInt();
        int[] num1 = new int[n1];
        
        // Read size of second array
        int n2 = s.nextInt();
        int[] num2 = new int[n2];
        
        // Input for first array
        System.out.println("Array1");
        for (int i = 0; i < n1; i++) {
            num1[i] = s.nextInt();
        }
        
        // Input for second array
        System.out.println("Array2");
        for (int i = 0; i < n2; i++) {
            num2[i] = s.nextInt();
        }
        
        // Convert int[] to List<Integer> using Stream
        List<Integer> list1 = Arrays.stream(num1).boxed().toList();
        int max1 = Collections.max(list1); // Find max of first array
        
        // Create output array based on max1
        int[] num = new int[n2];
        for (int i = 0; i < n2; i++) {
            if (num2[i] == max1) {
		num[i]=-1;
                continue; // Skip if num2[i] equals max1
            }
            num[i] = max1; // Otherwise, set num[i] to max1
        }
        
        // Print output
        System.out.println("Count is:");
        for (int i = 0; i < n2; i++) {
            System.out.println(num[i]);
        }
        
        s.close(); // Close scanner to prevent resource leak
    }
}