package com.omega.framework.task.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jackychenb on 11/12/2016.
 */
public class Task {

    public String id;
    public String type;
    public Date triggerTime;
    public Map<String ,String> dataMap = new HashMap<String,String>();

    public Task() {

    }

    public Task(String id, String type, Date triggerTime) {
        this.id = id;
        this.type = type;
        this.triggerTime = triggerTime;
    }

    public Task(String id, String type) {
        this(id, type, null);
    }

    public Task data(String key, String value) {
        dataMap.put(key, value);
        return this;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Task)) {
            return false;
        }

        return ((Task) obj).id.equals(id);
    }
}
