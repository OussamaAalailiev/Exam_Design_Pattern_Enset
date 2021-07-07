public class FilterImpl1 implements IFrameworkFilter {
    @Override
    public int[] filter(int[] data) {
        int[] i= {0,0};
        i[0]=data[5];
        i[1]=data[7];
        return i;
    }

}
