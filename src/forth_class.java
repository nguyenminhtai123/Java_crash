public class forth_class {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("a += 3 = " +(a+=3));
        int a1 = 6;
        System.out.println("a -= 5 = " +(a1-=5));
        int a2 = 6;
        System.out.println("a *= 2 = " +(a2*=2));
        int a3 = 6;
        System.out.println("a %= 5 = " +((float)(a3%=5)));
        int a4 = 6;
        int b = 2;
        System.out.println("a = " +(a4-(b+7)));
    }
}
