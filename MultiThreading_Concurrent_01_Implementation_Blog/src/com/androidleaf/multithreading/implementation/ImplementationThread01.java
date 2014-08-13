package com.androidleaf.multithreading.implementation;

public class ImplementationThread01 {
	
	public static void main(String[] args) {
		
		/*----------------------ʵ�ֶ��̵߳�һ�ַ�ʽ��ʵ��Runable�ӿ�----------------------------*/
		MyRunnable myRunnable = new MyRunnable();
		new Thread(myRunnable).start();
		new Thread(myRunnable).start();
		new Thread(myRunnable).start();
	}

}

class MyRunnable implements Runnable{

	private int tickets = 10;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (this) {
				if(tickets > 0){
					System.out.println("��Ʊ����" + tickets + "  ���ںţ�"
							+ Thread.currentThread().getName()
							+ " ����1��        ʣ��Ʊ����" + --tickets);
				}else{
					System.out.println("��Ʊ�����꣡��");
					break;
				}
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

