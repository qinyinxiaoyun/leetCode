package com.xiaomi;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean b = false;
        if (s.length()==0){
            System.out.println(b);
            return;
        }
        for (int i = 0;i< 3;i++){
            for (int j = 0; j <4 ; j++) {
                if (hass(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},s,0,i,j)){
                    b = true;
                    System.out.println(b);
                    return;
                }
            }
        }
        System.out.println(b);
    }

    private static boolean hass(char[][] board,String word,int index,int i,int j){
        if (i < 0||j < 0|| i>=board.length||j>=board[i].length)return false;
        if (word.length() == index + 1){
            if (board[i][j] == word.charAt(index))return true;
            else return false;
        }
        else {
            if (board[i][j] == word.charAt(index)){
                board[i][j] = (char) (board[i][j] ^ '*');
                boolean ans =  hass(board, word, index + 1, i+1, j)||hass(board, word, index + 1, i-1, j)||
                        hass(board, word, index + 1, i, j+1)||hass(board, word, index + 1, i, j-1);
                board[i][j] = (char) (board[i][j] ^ '*');
                return ans;
            }
            else return false;
        }
    }
}
