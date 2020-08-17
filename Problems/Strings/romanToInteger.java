class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int l = s.length();
        int last = 1000;
        for(int i = 0 ; i < l; i++){
            int v = getNum(s.charAt(i));
            if(v > last){
                num = num - last * 2;
            }
            num = num +v;
            last = v;
        }
        return num;
    }
    
    private int getNum(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}