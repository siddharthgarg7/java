// "static void main" must be defined in a public class.
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        int numberToFind = 7;
        int index = binarySearch(sortedArray,numberToFind, 0, 7);
        System.out.println(index);
              
    }
    
    public static int binarySearch(int[] sortedArray, int numberToFind,
                                  int start, int end) {
        
        int length = sortedArray.length; //9
        int midIndex = (start + (end-start)/2);
        int midElement = sortedArray[midIndex];
        
        if(midElement == numberToFind) 
            return midIndex;
        else if(midElement > numberToFind) {
            return binarySearch(sortedArray, numberToFind, start, midIndex);
        } else {
            return binarySearch(sortedArray, numberToFind, midIndex + 1, end);
        }
        
        
    }
}
