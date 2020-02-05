package com.markofheaven.designpattern.adapter.objectAdapter;


import com.markofheaven.designpattern.adapter.classAdapter.Adaptee;
import com.markofheaven.designpattern.adapter.classAdapter.Target;

public class Main {
    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
