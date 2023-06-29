public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        System.out.println("Value Before Swap a= " + a + " AND b= " + b);
        a = a + b;// 9+1=10 = a
        b = a - b;// 10-1=9 = b
        a = a - b;// 10-9=1 = a
        System.out.println("Value After Swap a= " + a + " AND b= " + b);
    }
}