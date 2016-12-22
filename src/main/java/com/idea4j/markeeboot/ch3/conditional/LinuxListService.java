package com.idea4j.markeeboot.ch3.conditional;

/**
 * Created by markee on 2016/12/22.
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
