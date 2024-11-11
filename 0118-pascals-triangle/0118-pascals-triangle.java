class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();


        for(int i = 1 ; i <= numRows ; i++){
            List<Integer> ls = new ArrayList<>();
            
            if(i == 1){
                ls.add(1);
                ans.add(ls);
            }else{
                    for(int j = 1 ;  j <= i ; j++){
                    if(j==1){
                        ls.add(1);
                        continue;
                    }else if(j == i){
                        ls.add(1); 
                        continue;
                    }
                    System.out.println(i);
                    List<Integer> lss = ans.get(i-2);
                    int x = lss.get(j-2);
                    int y = lss.get(j-1);
                    ls.add(x+y);
                }
                ans.add(ls);
            }
        }
        return ans;
    }
}