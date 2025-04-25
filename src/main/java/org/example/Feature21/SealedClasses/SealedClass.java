package org.example.Feature21.SealedClasses;

public sealed class SealedClass permits Product1,Product2,AbstractProduct {
    public void commonFunctionality(){
        System.out.println("This is a common functionality in the sealed class.");
    }
}
