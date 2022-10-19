class fib{
    public static void main(String[] args) {
        int n = 20;
        System.out.println(fib(n));
    }

    private static long fib(int n){
        if (n<=1){
            return n;
        }
        return (fib(n-1)+ fib(n-2));
    }
}