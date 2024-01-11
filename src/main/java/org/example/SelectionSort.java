package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public void getSort(){
        ArrayList<Integer> numbList = new ArrayList<>(Arrays.asList(7, 4, 6, 9, 1));
        System.out.println("Befor swap: "+ numbList);
        for (int i = 0; i <= numbList.size()-1; i++) {
            for (int j = i+1; j <= numbList.size()-1 ; j++) {
                if (numbList.get(i) > numbList.get(j)) {
                    swap(i , j, numbList);
                }
                }
            }
        System.out.println("After Swap: " + numbList);
        }
        public void swap(int i, int j, ArrayList<Integer> list){
            int temp = (int) list.get(i);
            list.set(i , list.get(j));
            list.set(j , temp);

        }

    }

