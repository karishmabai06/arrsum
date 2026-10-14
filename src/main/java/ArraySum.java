public class ArraySum {
    public int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
 
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Sum = " + obj.sum(numbers));
    }
}
