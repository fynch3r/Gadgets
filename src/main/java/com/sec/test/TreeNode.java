package com.sec.test;

import java.util.HashMap;

/**
 * @program: Gadgets
 * @description:
 * @author: 0range
 * @create: 2021-08-15 15:29
 **/


public class TreeNode {
    public String content;
    public HashMap<String,TreeNode> childs;

    public TreeNode(String content, HashMap<String,TreeNode> childs){
        this.content = content;
        this.childs = childs;
    }

    public String getContent() {
        return content;
    }

    public HashMap<String, TreeNode> getChilds() {
        return childs;
    }
}
