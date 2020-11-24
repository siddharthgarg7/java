// "static void main" must be defined in a public class.
public class LinearSearch {
    
    public static int findTheNumber(int[] arr, int x) {
        for (int i=0 ; i<arr.length ; i++) {
            if (x == arr[i]) {
                return i;
            } 
         }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int arr[] = {10, 20, 80, 30, 60, 50, 
                     110, 100, 130, 170};
        int  x = 110;
        
        // go thru the array - linear way - starting from the first element
        // looking for the needed element        
        int answer = findTheNumber(arr, x);
        if (answer == -1) {
            System.out.println("Cant find the number - " + x);
        } else {
            System.out.println("Number found at location - " + (answer+1));
        }
           
        
        
        
    }
}
