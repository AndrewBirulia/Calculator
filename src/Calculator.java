import java.util.*;
class Calculator {
public static void main (String[] args) {
int num1 = 0;
int num2 = 0;
int num3 = 0;
char a  ;

Scanner scan = new Scanner(System.in);

System.out.println("������� ������ �����: ");
num1 = scan.nextInt();
System.out.println("������� ������ �����: ");
num2 = scan.nextInt();
System.out.println("������� ��������: ");
a = scan.next().charAt(0);

switch (a) {
case '+':
num3 = num1+num2;
 break;
case '-':
num3 = num1-num2; 
break;
case '*':
num3 = num1*num2;
 break;
case'/': 
num3 = num1/num2; 
break;
}

System.out.println(num3);
}}