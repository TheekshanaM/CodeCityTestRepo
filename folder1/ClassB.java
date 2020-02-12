package folder1;

import folder1.folder2.TestInterface;

class ClassB extends ClassA implements TestInterface {
    public void QMethod(String args[]) {
        System.out.println("Hello");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    public void getNotified() {
        System.out.println("3");
    }
}