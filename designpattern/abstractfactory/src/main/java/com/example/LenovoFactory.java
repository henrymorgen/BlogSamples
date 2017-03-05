package com.example;

/**
 * Created by Administrator on 2017/1/26 0026.
 */

public class LenovoFactory extends ComputerFactory {
    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }
    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();
    }
}
