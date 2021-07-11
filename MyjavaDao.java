package com.hp.test;

import java.util.ArrayList;

/*
*输出hello
 */
public interface MyjavaDao {
    //main 方法快捷键   psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键 是 sout");//sout 输出的快捷键
        String name = "张三";
        System.out.println("name = " + name);//sout 可以显示出  变量
        System.out.println("MyjavaDao.main");//soutm是输出 方法的名称
        System.out.println("args = [" + args + "]");//soutp是输出 方法的名称
        int age = 17;
        if (age<18) {   //if 的快捷键是  ifn
            System.out.println("未成年");
        }
        ArrayList<String> strings = new ArrayList<>();//万能快捷键 alt+enter
        System.out.println("空");//Ctrl+d 快速复制一行
        System.out.println("空");//alt+鼠标  多行编辑
        System.out.println("空");//Ctrl+y  快速删除一行
        //Ctrl+z    一步撤销    //Ctrl+Shift+z  多步撤销
        for (String string : strings) {
            System.out.println("string =" + string);
        }
    }
}