public class Client {
    private IFrameworkFilter ifilter;
    private FrameworkAbsCompression absCompression;

    public void setIFilter(IFrameworkFilter ifilter) {
        this.ifilter = ifilter;
    }

    public void setAbsCompression(FrameworkAbsCompression absCompression) {
        this.absCompression = absCompression;
    }
    /**Test: Constructor*/
    public Client() {
//        this.absCompression = new CompressionImpl1()
//        ifilter = new FilterImpl1();
    }
    public int [] applyStrategyFilter(int[] data){
        return ifilter.filter(data);
    }
    public int [] applyStrategyCompress(int[] data){
        return absCompression.compresser(data);
    }
    public int [] applyStrategyAdapter(String name, int[] data){
        return ifilter.filter(data);
    }

}
