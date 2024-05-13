package Arrays;


/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;
public class SingleDimensionArray{
    int[] arr = null;
    int pointer = 0;
    /**
     * Constructor for the class. Takes in a size, which will be the size of the array. Fills the array with
     * integers with the min value.
     * @param sizeOfArray
     */
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * Used to insert a value into the array. If value is already present, it does not and will print that the
     * location is already full
     * @param location
     * @param valueToInsert
     */
    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("Value already present at index "+location);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array " +  e);
        }
    }

    /**
     * Used to select an element from the array at the specified index. This can be used to traverse the array
     * in combination of a loop. If out of bounds, will print that to console and return the min value.
     * @param index
     * @return element at given index
     */
    public int select(int index){
        try {
            return arr[index];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array " +  e);
            return Integer.MIN_VALUE;
        }
    }

    /**
     * Alternative to the above, returns the element at the location of the pointer
     * @return element at pinter
     */
    public int select(){
        return arr[pointer];
    }

    /**
     * Shifts the pointer further in the array. If it would be out of bounds, informs the user and
     * does not shift.
     */
    public void next(){
        if(pointer + 1 < arr.length){
            pointer++;
        }
        else {
            System.out.println("Pointer is unable to traverse to " + (pointer+1));
        }
    }

    /**
     * Shifts the pointer back in the array. If it would be out of bounds, informs the user and
     * does not shift.
     */
    public void previous(){
        if(pointer -1 > 0){
            pointer--;
        }
        else {
            System.out.println("Pointer is unable to traverse to " + (pointer-1));
        }
    }

    /**
     * Deletes the element at the given index
     * @param index
     */
    public void delete(int index){
        arr[index] = Integer.MIN_VALUE;
    }

    /**
     * Deletes the element at the location of the pointer
     */
    public void delete(){
        arr[pointer] = Integer.MIN_VALUE;
    }

    /**
     * Deletes all elements in the array
     */
    public void clear(){
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * Returns the first index that has an element that matches the parameter. Returns
     * -1 if no such element is found in the array.
     * @param element
     * @return index or -1
     */
    public int find(int element){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    /**
     * A toString override to help with displaying the contents our int[] arr in our SingleDimensionArray class
     * @return the contents of the arr instance variable in a string format
     */
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        //create the object of the class. we test the constructor here
        System.out.println("We create a single dimension array");
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        System.out.println(singleDimensionArray.toString());

        // testing the insert function
        System.out.println("We insert some values");
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,6);
        singleDimensionArray.insert(6,7);
        singleDimensionArray.insert(7,8);
        System.out.println(singleDimensionArray.toString());

        //testing the select by index

        System.out.println("We select index 0");
        System.out.println(singleDimensionArray.select(0));
        System.out.println("We select index 2");
        System.out.println(singleDimensionArray.select(2));
        System.out.println("We select index 11 (out of bounds)");
        System.out.println(singleDimensionArray.select(11));

        //testing traversing and selecting with pointer

        System.out.println("Current location of the pointer (location 0");
        System.out.println(singleDimensionArray.select());
        System.out.println("We test trying to go out of bounds with previous");
        singleDimensionArray.previous();
        System.out.println("We traverse through loop");
        for(int i = 0; i < 7; i++){
            singleDimensionArray.next();
            System.out.println(singleDimensionArray.select());
        }
        System.out.println("We try to break through the loop going forward");
        singleDimensionArray.next();
        System.out.println("We test going back");
        singleDimensionArray.previous();
        System.out.println(singleDimensionArray.select());

        //testing the search functions
        System.out.println("Searching for the element 5");
        System.out.println(singleDimensionArray.find(5));
        System.out.println("Searching for the element 99");
        System.out.println(singleDimensionArray.find(99));

        //testing the delete functions

        System.out.println("We delete at index 0");
        singleDimensionArray.delete(0);
        System.out.println(singleDimensionArray.toString());
        System.out.println("We delete at current pointer location");
        singleDimensionArray.delete();
        System.out.println(singleDimensionArray.toString());
        System.out.println("We clear the array");
        singleDimensionArray.clear();
        System.out.println(singleDimensionArray.toString());
    }
}
