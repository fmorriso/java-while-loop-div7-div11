public class Main {

    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while (n < 1000)
        {
            System.out.format("top of while: n=%d%n", n);
            if ((n % 7 == 0) && (n % 11) == 0)
            {
                count++;
            }
            n++;
        }
        System.out.format("final n=%d, count=%d%n",n,count);
    }
}
