package com.company;

import java.util.Scanner;

public class hhhh {



        public static void main(String[] args) {
            System.out.println("请输入数字，以英文逗号分隔,:");
            Scanner scanner = new Scanner(System.in); 
            String str = scanner.nextLine(); 
            String[] strRating = str.split(","); 
            int[] nums = new int[strRating.length];
            for (int i = 0; i < strRating.length; i++) {
                nums[i] = Integer.parseInt(strRating[i]);
            }
            bubble_sort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            System.out.println("请再输入数字，以英文逗号分隔,:");
            Scanner sc = new Scanner(System.in); 
            String str2 = sc.nextLine(); 
            String[] str2Rating = str2.split(","); 
            int[] nums2 = new int[str2Rating.length];
            for (int i = 0; i < str2Rating.length; i++) { 
                nums2[i] = Integer.parseInt(str2Rating[i]);
            }
            bubble_sort(nums2);

            int i = 0;
            int j = 0;
            int res[] = new int[nums.length + nums2.length];

            for (i = 0;i < res.length;i++){
                if (i < nums.length){
                    res[i] = nums[i];
                }
                else{
                    res[i] = nums2[i-nums.length];
                }
            }
            bubble_sort(res);

            for (int m = 0; m < res.length; m++) {
                System.out.println(res[m]);
            }





        }


        public static void bubble_sort(int nums[]) {
            for (int j = 1; j < nums.length; j++) {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                    }
                }
            }


        }
    }





