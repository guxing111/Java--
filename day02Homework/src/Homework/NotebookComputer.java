package Homework;

public class NotebookComputer {
    private InsertDrawable insertDrawable;

    public NotebookComputer() {
    }

    public NotebookComputer(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }
    public void insert(){
        insertDrawable.dosome();
    }
}
interface InsertDrawable{
    void dosome();
}
class mouse implements InsertDrawable{
    @Override
    public void dosome() {
        System.out.println("鼠标插入了");
    }

}
class keyboard implements InsertDrawable{
    @Override
    public void dosome() {
        System.out.println("键盘插入了");
    }
}
class monitor implements InsertDrawable{
    @Override
    public void dosome() {
        System.out.println("显示器插入了");
    }
}
class printer implements InsertDrawable{
    @Override
    public void dosome() {
        System.out.println("打印机插入了");
    }
}