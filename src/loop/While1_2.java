package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 1;
        int endNum = 5;
        int sum = 0;

        while(count <= endNum) {
            sum += count;
            System.out.println(count);
            count++;
        }

        System.out.println("총 합: " + sum);


    }
}
