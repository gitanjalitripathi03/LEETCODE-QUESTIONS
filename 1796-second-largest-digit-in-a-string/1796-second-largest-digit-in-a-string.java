class Solution {
    public int secondHighest(String s) {
        
        String []str = s.split("");

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(Character.isDigit(str[i].charAt(0))) list.add(Integer.parseInt(str[i]));
        }

        int []arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }

        int smax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]<max) smax = arr[i];
        }

        return smax;

    }
}