import java.util.Arrays;

public class MovieTheater {
    boolean[][] arr = null;

    public MovieTheater (int numberOfRows, int numberOfCols) {
        this.arr = new boolean[numberOfRows][numberOfCols];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = true;
            }
        }
    }

    public void displayTheater(){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if(arr[row][col]){
                    System.out.print(" 0 ");
                }else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }

    public boolean isAvaliable(int row, int col){
        try{
            return(arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Movie Seat Entered is Invalid!");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void setSeat(int row, int col, boolean value){
        try{
            this.arr[row][col] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Seat Out of Bounds!");
        }
    }

    public void reserveSeat(int row, int col){
        try{
            if(this.isAvaliable(row,col)) {
                this.setSeat(row, col, false);
                System.out.println("Reservation of seat " + row + " " + col + " sucessfull!");
            }else {
                System.out.println("Seat Reserved, please try another Seat!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter a movie seat within "+arr.length +"x"+arr[0].length+"!");
        }
    }

    public void unReserveSeat(int row, int col){
        try{
            if(!arr[row][col]){
                setSeat(row,col,true);
                System.out.println("Seat has been set to avaliable;");
            }else{
                System.out.println("Seat is already avaliable;");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Seat Out of Bounds!");
        }
    }

    public void clearTheater(){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                setSeat(row,col,true);
            }
        }
    }
    public static void main(String[] args) {
        MovieTheater mt = new MovieTheater(5,10);
        // We test the display
        mt.displayTheater();

        // we test the reserve seat function
        mt.reserveSeat(0,0);
        mt.reserveSeat(3,2);
        mt.reserveSeat(2,3);
        mt.reserveSeat(4,9);
        mt.displayTheater();

        // we test some fail cases
        mt.reserveSeat(0,0);
        mt.reserveSeat(32,32);

        // we unreserve a seat
        mt.unReserveSeat(0,0);
        mt.displayTheater();
        System.out.println();
        System.out.println();
        // we clear a theater
        mt.clearTheater();
        mt.displayTheater();
    }
}
