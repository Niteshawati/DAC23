class Type_casting{
    public static void main(String args[]){
        boolean b = false;
        String str=new Boolean(b).toString();
        System.out.println(str);

        boolean b1=true;
        boolean b2=Boolean.valueOf(b1);
        System.out.println(b2);

        String strname="Nitesh";
        boolean b3=Boolean.parseBoolean(strname);
        System.out.println(b3);



    }
}