package homework01;

public class MyStack{ // 栈类

    // 提供一个数组来存储栈中的元素
    private Object[] elements;

    // 栈帧（永远指向栈顶部的元素）
    // 每加1个元素，栈帧+1
    // 每减1个元素，栈帧-1
    private int index;

    // 构造方法

    public MyStack() {
        this.elements = new Object[10];
        this.index = -1;
    }

    // 构造方法是不是应该给一维数组一个初始化容量。

    // push方法（push方法压栈）
    public void push(Object obj){
        if (index >= elements.length-1){
            System.out.println("压栈失败，栈已满");
            return;
        }
        index ++;
        elements[index] = obj;
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
    }
    // 压栈表示栈中多一个元素。
    // 但是栈如果已满，压栈失败。
    // 这个方法的参数以及返回值类型自己定义。

    // pop方法（pop方法弹栈）
    public void pop(){
        if (index < 0){
            System.out.println(" 弹栈失败，栈已空！");
            return;

        }
        System.out.print("弹栈" + elements[index] + "元素成功，");
        // 栈帧向下移动一位。
        index--;
        System.out.println("栈帧指向" + index);
    }
    // 弹栈表示栈中少一个元素。
    // 但是栈如果已空，弹栈失败。
    // 这个方法的参数以及返回值类型自己定义。


    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
