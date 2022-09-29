class OvlAddittion {
    static void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    
    static void add(int a,int b, int c){
        int d=a+b+c;
        System.out.println(d);
    }
    
    static void add(int i, String s){
        String res=i+s;
        System.out.println(res);
    }
    
    public static void main(String[] args){
        add(10, 20);
        add(10, 20, 30);
        add(10, "a");
    }
}