public class Adaptateur implements IFrameworkFilter{
    private INonStandard iNonStandard = new NonStandardImpl();
    @Override
    public int[] filter(int[] data) {
        System.out.println("filter(..) called in class Adaptateur...");
        return iNonStandard.appliquerFilter("adapter",data);
    }

    public void setiNonStandard(INonStandard iNonStandard) {
        this.iNonStandard = iNonStandard;
    }
}
