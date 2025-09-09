class   Array_sameelements{
    public static void main(String[]a){
        int []ar1={1,2,3,4};
        int []ar2={1,2,3,4};
        if(ar1.length==ar2.length){
            for(int i=0;i<ar1.length;i++){
                
                if(ar1[i]==ar2[i]){
                    System.out.println("same elements");
                    break;
                }else
                {
                    System.out.println("not same");
                }
            }
        }
         else{
                    System.out.println("not same");
                }}}
            


        
