package number036;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] chars = {
                {'5', '3', '2', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '3', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(solution.isValidSudoku(chars));
    }


    public boolean isValidSudoku(char[][] board) {
        if (board.length == 0) {
            return false;
        }
        //检查行
        for (int i = 0; i < board.length; i++) {
            if (checkCharIsRepeat(board[i])) {
                return false;
            }
        }
        //检查列
        char[] portraitChars = new char[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                portraitChars[j] = board[j][i];
            }
            if (checkCharIsRepeat(portraitChars)) {
                return false;
            }
        }

        //检查9元素
        char[] charsTeam = new char[9];
        int index = 0;
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                charsTeam[index] = board[i][j];
                char[] teamChars = buildTeamChars(i, j, board);
                if (checkCharIsRepeat(teamChars)) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }


    public boolean checkCharIsRepeat(char[] source) {
        int[] appearCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < source.length; i++) {
            //49 ASCII对应 数字1
            int minus = source[i] - 49;
            if (minus >= 0 && minus < appearCount.length) {
                appearCount[minus]++;
            }
        }

        for (int count : appearCount) {
            if (count > 1) {
                return true;
            }
        }

        return false;

    }

    public char[] buildTeamChars(int x, int y, char[][] board) {
        char[] chars = new char[9];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                chars[index] = board[x + i][y + j];
                index++;
            }
        }
        return chars;

    }
}
