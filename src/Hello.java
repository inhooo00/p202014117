public class Hello {
    public static int sum(int n) {
        return (n == 1) ? 1 : n + sum(n - 1);
    }
}