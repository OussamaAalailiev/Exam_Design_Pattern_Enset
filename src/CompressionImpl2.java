public class CompressionImpl2 extends FrameworkAbsCompression{

    @Override
    protected int[] operation1(int[] data) {
        System.out.println("operation1 in CompressionImpl2 is called...");
        int[] i= {0,0};
        i[0]=data[0];
        i[1]=data[1];
        return i;
    }
//    @Override
//    protected int [] operation2() {
//        int[] data;
//        return data = new int[]{10,20,30,40,50,60,71,80,90,91};
//    }
}
