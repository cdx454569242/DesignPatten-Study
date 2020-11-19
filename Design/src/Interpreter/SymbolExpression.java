package Interpreter;

import java.util.HashMap;

/**
 * ����������Ž����� ���ÿ��������ţ���ֻ���Լ��������������й�ϵ��
 * ���������������п���Ҳ��һ�������Ľ�������ۺ������ͣ�����Expression���ʵ����
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
