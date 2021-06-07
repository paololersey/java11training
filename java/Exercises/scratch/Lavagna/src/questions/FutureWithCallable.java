package questions;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureWithCallable {

    private static final Double percentage = 0.2;
    private static final Double percentageLambda = 0.3;

    public static void execute() throws InterruptedException, ExecutionException {
        Callable<BigDecimal> calculation = new Callable<>() {
            public BigDecimal call() throws Exception {
                System.out.println("calculation progress");
                return BigDecimal.valueOf(1 + percentage);
            }
        };

        Callable<BigDecimal> calculationLambda = () -> {
            System.out.println("calculation progress with lambda");
            return BigDecimal.valueOf(1 + percentageLambda);
        };

        
        ExecutorService es = Executors.newCachedThreadPool();
        System.out.println("calculation before submit");
        Future<BigDecimal> result = es.submit(calculation);

        System.out.println("calculation after submit is " + result.get());

        Future<BigDecimal> resultLambda = es.submit(calculationLambda);
        System.out.println("calculation with lambda after submit is " + resultLambda.get());
    }
}