public class homework2 {
    public static void main(String[] args) {
        homework2 summary = new homework2();
        summary.result(7,15);

    }

    public void result(int a, int b){
        int c = 0;
        for(int i=a; i<=b; i++) {
            c += i;
        }
        System.out.println("The result should be : " + c );

    }
}
