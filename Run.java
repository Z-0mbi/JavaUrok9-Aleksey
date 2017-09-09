package carsNambers;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Run {
	private Random r;
	private ArrayList<CarNamber> namberList; 
	private Scanner sc;
		
	public Run() {
		this.r = new Random();
		this.namberList = new ArrayList<CarNamber>();
		this.sc = new Scanner(System.in);
	}
	
	private void makeNewCarNambers(int count) {
		String namNumerals;
		String namCode;
		String namLetters;
		
		for(int i=0; i<count;i++) {
			//�������� �����//�������� ������ ����
			namNumerals = Integer.toString(this.r.nextInt(999) + 1);
			while (namNumerals.length() < 3) {
				namNumerals = "0" + namNumerals;
			}
			//�������� ������
			System.out.println("������� ������ ����������� ����");
			namCode = this.sc.nextLine();
			
			//�������� �����
			System.out.println("������� ����� ������");
			namLetters = this.sc.nextLine().toUpperCase();
			
			System.out.println(namLetters.substring(0, 1) + namNumerals + namLetters.substring(1) + namCode);
			namberList.add(new CarNamber(namLetters, namNumerals, namCode));
		}
		
		//namberList.add(new CarNamber(namLetters, namNumerals, namCode));
	}
	
	public void seach() {
		System.out.println("������� �����");
		
		String nam = sc.nextLine();
		String namLetters = (nam.substring(0, 1) + nam.substring(4, 6)).toUpperCase();
		String namNumerals = nam.substring(1, 4);
		String namCode = nam.substring(6);
		System.out.println(namLetters);
		System.out.println(namNumerals);
		System.out.println(namCode);
		for (CarNamber cn : namberList) {
			if(cn.seachNamber(namLetters, namNumerals, namCode)) {
				System.out.println("����� ����� ����");
				return;
			}
			System.out.println("������ ������ ���");
		}
		
	}


	public static void main(String[] args) {
		Run nam = new Run();
		nam.makeNewCarNambers(1);
		nam.seach();

	}

}
