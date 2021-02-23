package Homework;

public class TextDemo {
    public static void main(String[] args) {
        InsertDrawable insertDrawable1 = new mouse();
        NotebookComputer not1 = new NotebookComputer(insertDrawable1);
        not1.insert();
        InsertDrawable insertDrawable2 = new keyboard();
        NotebookComputer not2 = new NotebookComputer(insertDrawable2);
        not2.insert();
        InsertDrawable insertDrawable3 = new monitor();
        NotebookComputer not3 = new NotebookComputer(insertDrawable3);
        not3.insert();
        InsertDrawable insertDrawable4 = new printer();
        NotebookComputer not4 = new NotebookComputer(insertDrawable4);
        not4.insert();
    }
}
