public class Conversion {

    /**
     * 16进制转化为字母
     * @param hex  要转化的16进制数，用空格隔开
     *         如：30 0E 00 09 7A 68 62 5F 74 6F 70 69 63 31 32 33
     * @return
     */
    public static String hex2Str(String hex) {
        StringBuilder sb = new StringBuilder();
        String[] split = hex.split(" ");
        for (String str : split) {
            int i = Integer.parseInt(str, 16);
            sb.append((char)i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String hex = "30 0E 00 09 7A 68 62 5F 74 6F 70 69 63 31 32 33";
        String hex1 = "10 26 00 04 4D 51 54 54 04 C2 00 78 00 08 6D 6F 73 71 75 69 74 6F 00 06 31 32 33 34 35 36 00 08 6D 6F 73 71 75 69 74 6F";
        String str = hex2Str(hex);
        System.out.println(str);
    }
}
