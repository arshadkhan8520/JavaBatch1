package src.reviewClass5;

public class StringVsStringBuilder {
    public static void main(String[] args) {


        String var1 = "Ahmad";
        String var2 = "Ali";
        String var3 = "Jan";
        String var4 = "Nobody";

        var4="body";

        StringBuilder str = new StringBuilder("Ahmad ");
        str.append ("khan");
        System.out.println(str);


    }

}
