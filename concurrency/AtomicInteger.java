package com.lnragi.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicDatatypes {

	private final static Integer NO_OF_INC = 5;
	private final static AtomicInteger ai = new AtomicInteger();

	public static void atomicIntegerAccumulateMethodTest() {
		ai.set(0);
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		IntStream.range(0, NO_OF_INC).forEach(i -> {
			Runnable mytask = () -> ai.accumulateAndGet(i, (a, b) -> a + b);
			executorService.submit(mytask);

		});

		executorService.shutdown();
		try {
			executorService.awaitTermination(120, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Accumulated Value  : " + ai.get());

	}

	public static void atomicIntegerIncrementAndGetMethodTest() {
		ai.set(0);
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		IntStream.range(0, NO_OF_INC).forEach( i -> executorService.submit(ai::incrementAndGet));
		executorService.shutdown();
		try {
			executorService.awaitTermination(120, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Incremented Value : " + ai.get());

	}
		public static void atomicIntegerUpdateAndGetMethodTest() {
		ai.set(0);
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		IntStream.range(0, NO_OF_INC).forEach(i -> {
			Runnable task = () -> ai.updateAndGet(n -> n + 2);
			executorService.submit(task);
		});
		executorService.shutdown();
		try {
			executorService.awaitTermination(120, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Updated value : " + ai.get());

	}
	
	public static void atomicIntegerDecrementAndGetMethodTest() {
		ai.set(0);
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		IntStream.range(0, NO_OF_INC).forEach( i -> executorService.submit(ai::decrementAndGet));
		executorService.shutdown();
		try {
			executorService.awaitTermination(120, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Decremented value : " + ai.get());

	}

	public static void main(String[] args) {
		atomicIntegerAccumulateMethodTest();
		atomicIntegerIncrementAndGetMethodTest();
		atomicIntegerDecrementAndGetMethodTest();
		atomicIntegerUpdateAndGetMethodTest();
	}

}
