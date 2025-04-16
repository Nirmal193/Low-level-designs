package org.example.test_facility;

import org.example.models.Accounts;
import org.example.models.AccountsDataGenerator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test_room_01 {
    public static void main(String[] args) {


    }
    public static void mergeFucntionalityOfToMap(){
        List<Accounts> accounts = AccountsDataGenerator.generateDummyAccounts(20);
        Map<Long, String> collect = accounts.stream().collect(Collectors.
                toMap(Accounts::getAccountId, Accounts::getAccountNumber,
                        (existing, replacement) -> existing,
                        LinkedHashMap :: new));
        System.out.println(collect);
    }
    public static void test01(){
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path parentPath = currentPath.getParent();

        File testDir = new File(parentPath.toString(),"test");

        File newFolder = new File(testDir, "newFolder");

        System.out.println(testDir.mkdir());

        System.out.println(newFolder.mkdir());
    }
}
