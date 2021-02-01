package com.company;

import java.util.Scanner;

public class hhhh {



        public static void main(String[] args) {
            System.out.println("请输入数字，以英文逗号分隔,:");
            Scanner scanner = new Scanner(System.in); //首先得到一行输入(以逗号分隔的一组数据),字符串形式str
            String str = scanner.nextLine(); //去掉str的分割逗号，得到字符数组strRating
            String[] strRating = str.split(","); //整数数组
            int[] nums = new int[strRating.length];
            for (int i = 0; i < strRating.length; i++) { //将字符数组的元素转换成整数数组
                nums[i] = Integer.parseInt(strRating[i]);
            }
            bubble_sort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            System.out.println("请再输入数字，以英文逗号分隔,:");
            Scanner sc = new Scanner(System.in); //首先得到一行输入(以逗号分隔的一组数据),字符串形式str
            String str2 = sc.nextLine(); //去掉str的分割逗号，得到字符数组strRating
            String[] str2Rating = str2.split(","); //整数数组
            int[] nums2 = new int[str2Rating.length];
            for (int i = 0; i < str2Rating.length; i++) { //将字符数组的元素转换成整数数组
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





