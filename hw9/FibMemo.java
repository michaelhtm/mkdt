import java.util.*;

public class FibMemo{

    private static Map<Integer,Long> map = new LinkedHashMap<>(){
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest){
            return false;
        }
    };

    public static long fib(int n){
        if(n<3) return 1;
        Long result=map.get(n);
        if(result==null){
            result=fib(n-1)+fib(n-2);
            map.put(n,result);
        }
        return result;
        
    }

    public static void main(String[] args){
        if(args.length<1){
            System.err.println("Include atleast one numebr in command line");
            return;
        }

        long start;
        long end;
        for(String s:args){
            start = System.currentTimeMillis();
            long ans=fib(Integer.parseInt(s));
            end = System.currentTimeMillis();
            System.out.printf("Fib Number %s = %d (%dms)\n",s,ans,end-start);
        }

    }
}