package com.androidleaf.multithreading.implementation;

public class ImplementationThread02 {

	public static void main(String[] args) {
		
		/*----------------------ʵ�ֶ��̵߳ڶ��ַ�ʽ���̳�Thread��----------------------------*/
	    new MyThread().start();
		new MyThread().start();
		new MyThread().start();
	}
}

class MyThread extends Thread{
	
	private int tickets = 5;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			synchronized (this) {
				if(tickets > 0){
					System.out.println("��Ʊ����" + tickets + "  ���ںţ�"
							+ Thread.currentThread().getName()
							+ "����1��        ʣ��Ʊ����" + --tickets);
				}else{
					System.out.println("��Ʊ�����꣡��");
					break;
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
