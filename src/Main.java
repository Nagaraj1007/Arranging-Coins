
public class Main {

    public static int completeRows(int number){
        int row = 1, count = 0;
        while (number > row){
            number -= row;
            count++;
            row++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(completeRows(8));
    }
}