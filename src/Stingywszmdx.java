public class Stingywszmdx {
    public static void main(String[] args) {
        String str="holle world";
        /*
        regular expression:正则表达式
         */
        /*
        赋值符号左右两侧的类型必须一致
         */
        String s[]=str.split("\\s");
        String news[]=m(s);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<news.length;i++) {
            sb.append(news[i]);
            sb.append(" ");
        }
        System.out.println("最终处理结果："+sb.toString());
    }
    public static String [] m(String str[]) {
        String news[] = new String[str.length];
        for(int i=0;i<str.length;i++) {
            char c[]={str[i].charAt(0)};
            String string = new String(c);
            String part1=string.toUpperCase();
            String part2=str[i].substring(1);
            news[i]=part1.concat(part2);
        }
        return news;
    }
}
