import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     * Complete the 'maximumLearning' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY iv
     *  2. INTEGER_ARRAY articles
     *  3. INTEGER p
     */
    public static int maximumLearning(List<Integer> iv, List<Integer> articles, int p) {
	
    List<Integer> artCount = new ArrayList<Integer>();
    
    for (int i =0; i<articles.size();i++) {
        artCount.add(articles.get(i)*2);
    }
		/*
		 * 3 3 2 2 3 3 2 2 9
		 */
   int max = Integer.MIN_VALUE;
   for(int i=0; i<iv.size(); i++){
       if(iv.get(i) > max){
           max = iv.get(i);
       }
   }
    	return p;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int ivCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> iv = new ArrayList<>();
		
        for (int i = 0; i < ivCount; i++) {
            int ivItem = Integer.parseInt(bufferedReader.readLine().trim());
            iv.add(ivItem);
        }

        int articlesCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> articles = new ArrayList<>();
        for (int i = 0; i < articlesCount; i++) {
            int articlesItem = Integer.parseInt(bufferedReader.readLine().trim());
            articles.add(articlesItem);
        }
        int p = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.maximumLearning(iv, articles, p);
        bufferedReader.close();
    }
}


