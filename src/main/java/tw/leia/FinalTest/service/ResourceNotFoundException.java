package tw.leia.FinalTest.service;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s) {
        System.out.println("Resource not Found");
    }
}