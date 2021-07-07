public abstract class FrameworkAbsCompression {
//    protected int[] data;
    int [] compresser(int[] data){
        /**This function has to be modified*/
        System.out.println("*********CompressImplementation***************");
        System.out.println("Template method is called...");
        int[] a = operation1(data);
        return a;
    }

    public FrameworkAbsCompression() {
    }

    protected abstract int [] operation1(int[] data);
    /**Test*/
//    protected abstract int [] operation2();
}
