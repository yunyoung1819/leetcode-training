package leetcode.level.easy;

/**
 * problem : 657
 * title : Robot Return to Origin
 * link : https://leetcode.com/problems/robot-return-to-origin/
 * date : 2020.06.06
 * author : YUN YOUNG 
 * 
 * description : There is a robot starting at position (0,0), the origin, on a 2D plane. 
 * Given a sequence of its moves, judge if this robot ends up at (0,0) after it completes its moves.
 * 
 * The move sequence is represented by a string, and the character moves[i] represents it ith move.
 * Valid moves are R(right), L(left), U(up), and D(down). if the robot returns to the origin 
 * after it finishes all of its moves, return true. Othrewise, return false.
 * 
 * Example 1:
 * Input: "UD"
 * Output: true
 * 
 * Example 2:
 * Input: "LL"
 * Output: false
 *
 */
public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return (x == 0 && y == 0) ? true : false;
    }
}
