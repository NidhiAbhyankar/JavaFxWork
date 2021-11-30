package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count[]={31,45,6,9,10,23};
        Set<Integer> set=new HashSet<>();
        try{
            for(int i=0;i<count.length;i++){
                set.add(count[i]);
            }
           /* System.out.println("Our Set "+set);
            System.out.println("Size "+ set.size());
            set.remove(count[0]);
            System.out.println(set);
            if(set.contains(3)){
                System.out.println("yes");
            }else{
                System.out.println("noo!");
            }*/

            TreeSet sortedSet=new TreeSet(set);
            System.out.println("Sorted ist: "+sortedSet);

            LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
            linkedHashSet.add("hello");
            linkedHashSet.add("hii");
            linkedHashSet.add("hola");

            Iterator<String> iterator=linkedHashSet.iterator();
            while(iterator.hasNext()){
                System.out.println("Things: "+iterator.next());
            }

        }catch (Exception e){

        }
    }
}
