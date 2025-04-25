package org.example.Feature21.StucturedScope;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;
public class OrderingScope {
    public String fetchUser() throws  Exception{
        Thread.sleep(100);
        return "User 1000";
    }
    public String fetchOrder() throws Exception{
        Thread.sleep(200);
        return "order 1000";
    }
    public void orderingScope(){
        try(var scope = new StructuredTaskScope.ShutdownOnFailure()){
            Subtask<String> user  = scope.fork(() -> fetchUser());
            Subtask<String> order = scope.fork(()-> fetchOrder());

            scope.join();
            scope.throwIfFailed();

            System.out.println("user" + user.get());
            System.out.println("order" + order.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        OrderingScope orderingScope = new OrderingScope();
        orderingScope.orderingScope();
        System.out.println("This is the end of the program");
    }
}
