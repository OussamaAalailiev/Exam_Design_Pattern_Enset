import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        int[] data = new int[]{2,4,6,5,0,1,3,6,7};
        Client client = new Client();
        System.out.println("----Saisi des classes Par l'utilisateur :---");
        Scanner clavier = new Scanner(System.in);

            System.out.println("Nom de la classe Filter à saisi: ");
            String nomDeClasseAsaisi = clavier.next();
            /**Test: */
            System.out.println("Nom de la classe Compression à saisi: ");
            String nomDeClasseCompressAsaisi = clavier.next();
//            if (nomDeClasseAsaisi.equals("exit"))
//                break;
            try {
                Class classFilterExtractedAndStord= Class.forName(nomDeClasseAsaisi);
                IFrameworkFilter iFrameworkFilter = (IFrameworkFilter) classFilterExtractedAndStord.newInstance();
                Class classCompressExtractedAndStord= Class.forName(nomDeClasseCompressAsaisi);
                FrameworkAbsCompression iFrameworkCompress = (FrameworkAbsCompression) classCompressExtractedAndStord.newInstance();
                /**FilterImpl1 & FilterImpl2 are ready to be called: */
                System.out.println("*********FilterImplementation***************");
                client.setIFilter(iFrameworkFilter);
                int [] i = client.applyStrategyFilter(data);
                for(int j : i)
            System.out.println("value of index returned ->j : "+j);

                /**Adaptateur is ready to be called: */
                System.out.println("************************");
                Adaptateur adaptateur = new Adaptateur();
                client.setIFilter(adaptateur);
                adaptateur.setiNonStandard(new NonStandardImpl());

                /**CompressionImpl1 & CompressionImpl2 are ready to be called: */
                System.out.println("************************");
                client.setAbsCompression(iFrameworkCompress);
                int[] b = client.applyStrategyCompress(data);
                for(int j : b)
                    System.out.println("value of index returned ->j : "+j);
//                int [] i2 = client.applyStrategyCompress(data);
//                for(int j : i2)
//                    System.out.println("value of index returned ->j : "+j);

            } catch (Exception e) {
                System.out.println("Strategy Does not exist!...");
            }

//      System.out.println("----Saisi des classes manuellement---");
//        client.setIFilter(new FilterImpl1());
//        System.out.println("Strategy 1: FilterImpl1() :");
//        int[] i = client.applyStrategyFilter(data);
//
//        for(int j : i)
//            System.out.println("value of index returned ->j : "+j);
//        System.out.println("**************************");
//        System.out.println("Strategy 2: FilterImpl2() ");
//        client.setIFilter(new FilterImpl2());
//        int[] a = client.applyStrategyFilter(data);
//
//        for(int j : a)
//            System.out.println("value of index returned ->j : "+j);
//        System.out.println("******************************");
//        System.out.println("Strategy 3: CompressImpl1() ");
//        client.setAbsCompression(new CompressionImpl1());
//        int[] b = client.applyStrategyCompress(data);
//        for(int j : b)
//            System.out.println("value of index returned ->j : "+j);
//        System.out.println("******************************");
//        System.out.println("Strategy 4: CompressImpl2() ");
//        client.setAbsCompression(new CompressionImpl2());
//        int[] c = client.applyStrategyCompress(data);
//        for(int j : c)
//            System.out.println("value of index returned ->j : "+j);
//        System.out.println("***************************************");
//        System.out.println("Strategy 5 Adapter =>: NonStandardImpl() ");
//        client.setIFilter(new Adaptateur());
//        int[] adapterData = client.applyStrategyAdapter("Adapter Strategy",data);
//        for(int j : adapterData)
//            System.out.println("value of index returned ->j : "+j);

//        System.out.println(client.getAbsCompression().compresser(data).length);
    }
}
