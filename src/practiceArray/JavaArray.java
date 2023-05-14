package practiceArray;

public class JavaArray {
    public static void main(String[] args) {
        JavaArray s1 = new JavaArray();
        s1.printarray();
    }

    public void printarray() {
        char[] arr = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
