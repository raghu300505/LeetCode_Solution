class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int n=A.length;
        int[] res=new int[n];
        Set<Integer>result=new HashSet<>();
        Set<Integer>result1=new HashSet<>();
        for(int i=0;i<n;i++){
            result.add(A[i]);
            result1.add(B[i]);
            int count1=0;
            for(int num:result){
                if(result1.contains(num)){
                    count1++;
                }
            }
            res[i]=count1;
        }
        return res;
    }
}