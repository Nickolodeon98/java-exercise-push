public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Hello"); // alt + shift + f10

        int[] array = new int[10];
        int i = 1;

        for (int member : array) {
            member = i;
            i++;
            System.out.print(member + " ");
        }
    }
}
