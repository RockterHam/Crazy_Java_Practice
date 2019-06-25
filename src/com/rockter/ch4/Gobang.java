package com.rockter.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *      功能：五子棋
 *      完成时间：19/6/14 18:58
 *      版本记录:
 *          V0.1:实现了棋盘与显示棋子
 *      造轮子的人:Rockter
 */
public class Gobang {
    private static int BOARD_SIZE = 15;
    private String [][] board;
    public void initBoard(){
        board = new String[BOARD_SIZE][BOARD_SIZE * 2 + 1];//由于行间距，调整一行为两倍的数量，偶数数存在棋盘
        for(int i = 0;i < BOARD_SIZE;i ++){
            for(int j = 0;j < BOARD_SIZE * 2 + 1 ;j ++){
                if(j == BOARD_SIZE * 2){
                    board[i][j] = "\n";
                }
                else{
                    if(j%2 == 0){
                        board[i][j] = " ";
                    }
                    else{
                        board[i][j] = "+";
                    }
                }
            }
        }
    }

    public void setBoard(){
        for(int i = 0;i < BOARD_SIZE;i ++) {
            for (int j = 0; j < BOARD_SIZE * 2 + 1; j++) {
                System.out.print(board[i][j]);
            }
        }
    }




    public static void main(String[] args) throws IOException {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.setBoard();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        System.out.println("请输入您下棋的坐标（x,y）：");
        while ((inputStr = br.readLine()) != null){

            String[] posStrArr = inputStr.split(",");

            int xPos = Integer.parseInt(posStrArr[0]);
            int yPos = Integer.parseInt(posStrArr[1]);

            gb.board[yPos - 1][xPos * 2 - 1] = "·";
            gb.setBoard();
            System.out.println("请输入您下棋的坐标（x,y）：");

        }
    }

}
