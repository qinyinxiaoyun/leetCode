package com.backtrace;
/**
 * Given a 2D board and a list of words from the dictionary, find all words in the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells
 * are those horizontally or vertically neighboring. The same letter cell may not be used more than
 * once in a word.
 * 为避免重复利用同一个字母，在使用字母后将其与*做或运算，之后恢复
 */

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
