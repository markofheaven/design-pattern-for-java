package com.markofheaven.designpattern.adapter.objectAdapter;

import com.markofheaven.designpattern.adapter.classAdapter.Adaptee;
import com.markofheaven.designpattern.adapter.classAdapter.Target;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
