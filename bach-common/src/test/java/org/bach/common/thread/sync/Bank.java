package org.bach.common.thread.sync;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

	private final double[] accounts;

	public Bank(int n, int initialBalance) {
		accounts = new double[n];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = initialBalance;
		}
	}

	public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
		if (accounts[from] < amount)
			wait();
		System.out.print(Thread.currentThread());
		accounts[from] -= amount;
		System.out.printf(" %10.2f from %d to %d", amount, from, to);
		accounts[to] += amount;
		System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
		notifyAll();
	}

	private synchronized double getTotalBalance() {
		try {
			double sum = 0;

			for (double a : accounts)
				sum += a;
			return sum;
		} finally {
		}
	}

	public int size() {
		return accounts.length;
	}
}
