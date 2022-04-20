package Java_advance;

public class Less5_codewars {
    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        //String substring = herOld.substring(0,1);
        return Character.getNumericValue(c);
        //return Integer.parseInt(substring);
   }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }

    public static void main(String[] args) {
      System.out.println(howOld("5 years old"));
        System.out.println(getVolumeOfCuboid(2,4,6));
    }
}
