public class NonStandardImpl implements INonStandard {
    @Override
    public int[] appliquerFilter(String filterName, int[] data) {
        System.out.println("appliquerFilter in NonStandardImpl: " + filterName);
        int[] i= {0,0};
        i[0]=data[2];
        i[1]=data[3];
        return i;
    }
}
