public class CompressionImpl1 extends FrameworkAbsCompression{

    @Override
    protected int [] operation1(int [] data) {
        System.out.println("operation1 in CompressionImpl1 is called...");
        int[] i= {0,0};
        i[0]=data[7];
        i[1]=data[8];
        return i;
    }
//    @Override
//    protected int [] operation2() {
//        return data = new int[]{10, 20, 30, 40, 50, 60, 71, 80, 90, 91};
//    }

}
