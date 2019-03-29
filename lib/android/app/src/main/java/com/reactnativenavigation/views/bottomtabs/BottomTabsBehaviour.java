package com.reactnativenavigation.views.bottomtabs;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;

import com.reactnativenavigation.views.BehaviourAdapter;
import com.reactnativenavigation.views.BehaviourDelegate;
import com.reactnativenavigation.views.BottomTabs;

public class BottomTabsBehaviour<V extends ViewGroup> extends BehaviourDelegate<V> {
    public BottomTabsBehaviour(BehaviourAdapter<V> delegate) {
        super(delegate);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, V child, View dependency) {
        return dependency instanceof BottomTabs;
    }
}
