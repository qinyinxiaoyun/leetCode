package com.backtrace;

import java.util.ArrayList;
import java.util.List;

public class P212Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        for (String word:words){
            boolean f = false;
            for (int i = 0;i<board.length;i++){
                if (f)break;
                for (int j = 0;j<board[i].length;j++){
                    if (haspath(i,j,board,word,0)) {
                        f = true;
                        break;
                    }
                }
            }
            if (f)ans.add(word);
        }
        return ans;
    }
    public boolean haspath(int i ,int j,char[][] board,String word,int index){
        if (i<0 || i>=board.length || j<0 || j>=board[i].length)return false;
        if (board[i][j] == word.charAt(index)){
            if (index == word.length() - 1)return true;
            else {
                board[i][j] = (char) (board[i][j] ^ '*');
                boolean t = haspath(i-1,j,board,word,index+1)||haspath(i+1,j,board,word,index+1)
                        ||haspath(i,j-1,board,word,index+1)||haspath(i,j+1,board,word,index+1);
                board[i][j] = (char) (board[i][j] ^ '*');
                return t;
            }
        }
        else return false;
    }
}
