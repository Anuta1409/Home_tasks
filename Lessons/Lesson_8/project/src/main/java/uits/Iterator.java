package uits;
/**
 * Created by Anna on 05.12.2015.
 */

/**
 * Iterator - �� ��� ����� �� ������� ��� ���������
 * ������;
 * 1) hasNest - ������ ������� ������� �� ����� �������
 * 2) next - ������� ������� ���������
 * Object - �������� ���� �������
 */
public interface Iterator {
    public boolean hasNest();//���������, ��������������� �������
    public Object next();// ���������� ��������� �������

}
