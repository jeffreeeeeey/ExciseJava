package excise.selfedu;

public class J_Grid15 {
	int [][] m_board;
	public J_Grid15() {
		m_board = new int[3][3];
	}
	//输出棋盘格线行
	private void mb_outputGridRowBoard()
	{
		int i;
		System.out.print("+");
		for(i = 0; i < 5; i++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	}//方法mb_outputGridRowBoard结束
	
	//输出棋盘数据行
	private void mb_outputGridRowBoard(int i)
	{
		int j;
		for(j = 0; j < m_board[i].length; j++)
		{
			System.out.print("|" + m_board[i][j]);
		}
		System.out.println("|");
	}//方法mb_outputGridRowBoard结束
	
	//输出棋盘
	public void mb_outputGrid()
	{
		int i;
		mb_outputGridRowBoard();
		for (i = 0; i < m_board.length; i++) {
			mb_outputGridRowBoard(i);
			mb_outputGridRowBoard();
		}//for循环结束
	}//method mb_outputGrid end
	
	//初始化数据
	private void mb_dataInit()
	{
		int i, j, k;
		for(i = 0, k = 1; i < m_board.length; i++)
		{
			for (j = 0; j < m_board[i].length; j++, k++) {
				m_board[i][j] = k;
			}
		}
	}//method mb_dataInit end.
	
	//数据结束检测
	private boolean mb_dataEnd()
	{
		for (int i = 0, k = 9; i < m_board.length; i++) {
			for (int j = 0; j < m_board[i].length; j++, k--) {
				if (m_board[i][j] != k) {
					return(false);
				}
			}
		}
		return(true);
	}// method mb_dataEnd end.
	
	//取下一个数据
	private void mb_dataNext()
	{
		for (int i = m_board.length - 1; i >= 0; i--) {
			for (int j = m_board[i].length - 1; j >= 0; j--) {
				if (m_board[i][j] == 9) {
					m_board[i][j] = 1;
				}else {
					m_board[i][j]++;
					return;
				}//if-else end
			}
		}
	}// method mb_dataNext end;
	
	//数据检测: 判断是否有相同的数字, 存在返回false, 否则true
	private boolean mb_dataCheckDifferent()
	{
		int i, j;
		int[] digit = new int[10];
		for (i = 0; i < m_board.length; i++) {
			for (j = 0; j < m_board[i].length; j++) {
				digit[m_board[i][j]] = 1;
			}
		}
		for (i = 1, j = 0; i < digit.length; i++) {
			j += digit[i];
		}
		if (j == 9) {
			return(true);
		}
		return(false);
	}// method mb_dataCheckDifferent end;
	
	//数据检测:各行和是否是15
	private boolean mb_dataCheckSumRow()
	{
		int i, j, k;
		for (i = 0;  i < m_board.length; i++) {
			for(j = 0, k = 0; j < m_board[i].length; j++)
			{
				k += m_board[i][j];
			}
			if (k != 15) {
				return(false);
			}
		}//for loop end;
		return(true);
	}
	
	//数据检测:各列和是否是15
	private boolean mb_dataCheckSumColumn()
	{
		int i, j, k;
		for(i = 0; i < m_board.length; i++)
		{
			for(j = 0, k = 0; j < m_board.length; j++)
			{
				k += m_board[j][i];
			}
			if (k != 15) {
				return(false);
			}
		}//for loop end;
		return(true);
	}
	
	private boolean mb_dataCheck()
	{
		if(!mb_dataCheckDifferent())
			return(false);
		if (!mb_dataCheckSumRow()) {
			return(false);
		}
		if (!mb_dataCheckSumColumn()) {
			return(false);
		}
		if (m_board[0][0] + m_board[1][1] + m_board[2][2] != 15) {
			return(false);
		}
		if (m_board[0][2] + m_board[1][1] + m_board[2][0] != 15) {
			return(false);
		}
		return(true);
	}
	
	//求解并输出棋盘问题
	public void mb_arrange()
	{
		int n = 1;
		for (mb_dataInit(); !mb_dataEnd(); mb_dataNext()) {
			if (mb_dataCheck()) {
				System.out.println("第" + n + "个结果:");
				n++;
				mb_outputGrid();
			}//if end;
		}//for loop end;
	}//method mb_arrange end;
	
}
