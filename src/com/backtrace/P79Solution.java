package com.backtrace;

import org.junit.Test;

public class P79Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j < board[i].length;j++){
                if (path(board,word,0,i,j))return true;
            }
        }
        return false;
    }

    private boolean path(char[][] board,String word,int index,int i,int j){
        if (i < 0||j < 0|| i>=board.length||j>=board[i].length)return false;
        if (word.length() == index + 1){
            if (board[i][j] == word.charAt(index))return true;
            else return false;
        }
        else {
            if (board[i][j] == word.charAt(index)){
                board[i][j] = (char) (board[i][j] ^ '*');
                boolean ans =  path(board, word, index + 1, i+1, j)||path(board, word, index + 1, i-1, j)||
                        path(board, word, index + 1, i, j+1)||path(board, word, index + 1, i, j-1);
                board[i][j] = (char) (board[i][j] ^ '*');
                return ans;
            }
            else return false;
        }
    }

    @Test
    public void test(){
        char[][] board = {{'A','B','C','D'},{'E','F','G','H'}};
        String word = "DHG";
        System.out.println(exist(board,word));
        System.out.println(board[0].length);
    }
}
