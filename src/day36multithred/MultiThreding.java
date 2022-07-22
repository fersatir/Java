package day36multithred;

public class MultiThreding {
    public static void main(String[] args) {
        System.out.println("*** Single Thread ***");

        SingleThreadSayac sT1 = new SingleThreadSayac(1);
        sT1.sThreadSayas();


        SingleThreadSayac sT2 = new SingleThreadSayac(2);
        sT2.sThreadSayas();

        System.out.println("*** Multi Thread ***");

        MultiThreadSayac mT1 = new MultiThreadSayac(3);
        mT1.mThreadSayas();
    }
}

class SingleThreadSayac{
    private int threadNo;

    public SingleThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }

    public void sThreadSayas(){
        for(int i=0;i<=10;i++){
            System.out.println("i "+i+" için çalışan thread no: "+ threadNo);
        }
    }
}

class MultiThreadSayac extends Thread{
    private int threadNo;

    public MultiThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }

    public void mThreadSayas(){
        for(int i=0;i<=10;i++){
            System.out.println("i "+i+" için çalışan thread no: "+ threadNo);
        }
    }
}
