class java {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};

        int res [] = new int [2];

        // find the missing number

        int idx = 0;

        for(int i = 0 ; i< arr.length ; i++){
            if(i+1 != arr[i]){
                res[idx++] = i+1;
            }
        }

        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i]);
        }
    }
}