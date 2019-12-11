package by.gsu.pmslab;

public class ClaculatorThread extends Thread {
    private int a;
    private double result=1;
    public ClaculatorThread(int a){
        this.a=a;
    }
    public double getResult() {
        boolean b = true;
        for (int P = 2; P <= a; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) result*=P;
            else b = true;

        }
        return result;
    }
}
