class Ch2{
    public static void main(String args[]){
        double minutes=3456779;
        int years;
        int days;

    

        System.out.println(System.in);
        System.out.println("Input the number of Minutes");
         
        int years = (int) (minutes/(60*24*365));
        int days = (int) (minutes/60/24)%365;

        System.out.println(minutes +" minutes is equal to : " + years + " years and "+ days + " days");
        




    }
}