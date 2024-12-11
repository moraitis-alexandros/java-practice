package cf.ch6;

/**
 *
 */
public class ArrayDeepCopy {
    public static void main(String[] args) {
          int[] arr = {1, 2, 3};
          int[] arrCopied = arrDeepCopy(arr);

          for (int el : arrCopied) {
              System.out.println(el);
          }
    }//main


    /**
     * It does a fresh copy (deep copy) of an array
     * @param source the source array
     * @return the copied array
     */
    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

//
//        System.arraycopy(source, 0, destination, 0, source.length); //2ος τρόπος

//       destination = Arrays.copyOf(source, source.length); //3ος τρόπος

//       destination = Arrays.copyOfRange(source, 0, source.length); //4ος τρόπος

       return destination;
    }//arrDeepCopy

}//class
