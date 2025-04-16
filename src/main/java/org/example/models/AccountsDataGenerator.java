package org.example.models;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountsDataGenerator {
    public static List<Accounts> generateDummyAccounts(int count) {
        List<Accounts> accountsList = new ArrayList<>();
        Random random = new Random();
        String[] accountTypes = {"SAVINGS", "CURRENT", "FIXED_DEPOSIT"};
        String[] currencies = {"USD", "EUR", "GBP", "INR"};

        for (int i = 0; i < count; i++) {
            Accounts account = new Accounts(
                (long) (i + 1000),                                    // accountId
                String.format("ACC%06d", random.nextInt(999999)),     // accountNumber
                "Customer " + (i + 1),                                // accountHolderName
                accountTypes[random.nextInt(accountTypes.length)],    // accountType
                BigDecimal.valueOf(random.nextInt(100000)),          // balance
                String.format("BR%03d", random.nextInt(999)),        // branchCode
                currencies[random.nextInt(currencies.length)]         // currency
            );

            account.setEmail("customer" + (i + 1) + "@example.com");
            account.setPhoneNumber(String.format("+1%09d", random.nextInt(999999999)));
            account.setAddress("Address " + (i + 1) + ", City");

            accountsList.add(account);
        }
        return accountsList;
    }
}
