class AS_12{
    public static void main(String args[]){
        int value=50;
        String s1=Integer.toString(value);
        System.out.println(s1);

        Integer s2=Integer.valueOf(value);
        System.out.println(s2);
        
        String strs3="259";
        Integer s3=Integer.valueOf(strs3);
        System.out.println(s3);


    } 
}