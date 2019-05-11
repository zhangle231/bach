package org.bach.common.thread;

public class UnsynchBankTest {

	private static final int MACCOUNTS = 100;
	private static final int INITIAL_BALANCE = 1000;
	
	public static void main(String[] args) {
		Bank b = new Bank(MACCOUNTS, INITIAL_BALANCE);
		int i;
		for (i = 0; i < MACCOUNTS; i++) {
			TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}
