package com.example;

/**
 * Created by Administrator on 2017/1/26 0026.
 */
public abstract class ComputerFactory {
    public abstract DesktopComputer createDesktopComputer();
    public abstract NotebookComputer createNotebookComputer();
}
