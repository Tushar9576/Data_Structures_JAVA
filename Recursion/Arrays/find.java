package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
          int[] arr = {1,2,4,3,4,4,5,16,10};
//        System.out.println(search(arr,4,0));
//        System.out.println(findIndex(arr, 4,0));
//        findallIndex(arr,4,0);
//        System.out.println(list);
        System.out.println(findallIndex2(arr,4,0));

    }
    static boolean search(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
// For Multiple occurences
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findallIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList<Integer> list ){
        if (index == arr.length){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findallIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findallIndex2(int[] arr, int target, int index ){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list ;
        }
   // this will contain ans from that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallIndex2(arr, target, index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
