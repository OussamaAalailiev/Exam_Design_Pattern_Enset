public class FilterImpl2 implements IFrameworkFilter {
    @Override
    public int[] filter(int[] data) {
        int[] i= {0,0};
        i[0]=data[1];
        i[1]=data[3];
        return i;

    }
}
