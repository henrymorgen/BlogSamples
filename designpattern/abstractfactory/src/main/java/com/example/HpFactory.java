package com.example;

/**
 * Created by Administrator on 2017/1/26 0026.
 */

public class HpFactory extends ComputerFactory {
    @Override
    public DesktopComputer createDesktopComputer() {
        return new HpDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new HpNotebookComputer();
    }
}
