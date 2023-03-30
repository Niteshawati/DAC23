class AS_9{
    public static void main(String args[]){
        short s=5000;
        String s1=Short.toString(s);
        System.out.println(s1);

        short s2=Short.valueOf(s);
        System.out.println(s2);

        String str="1234";
        short strb=Short.valueOf(str);
        System.out.println(strb);



    }
}