package com.sec.test;

import java.util.*;

/**
 * @program: Gadgets
 * @description:
 * @author: 0range
 * @create: 2021-08-15 15:30
 **/


public class MultiTree {
    public TreeNode root;
    public List<String> pathList = new ArrayList<>();

    public MultiTree(){
        //创建根节点
        HashMap rootChilds = new HashMap();
        this.root = new TreeNode("r",rootChilds);

        //第一层子节点
        HashMap aChilds = new HashMap();
        TreeNode aNode = new TreeNode("a",aChilds);

        HashMap bChilds = new HashMap();
        TreeNode bNode = new TreeNode("b",bChilds);

        HashMap gChilds = new HashMap();
        TreeNode gNode = new TreeNode("g",gChilds);

        //第二层结点
        HashMap dChilds = new HashMap();
        TreeNode dNode = new TreeNode("d",dChilds);

        HashMap cChilds = new HashMap();
        TreeNode cNode = new TreeNode("c",cChilds);

        HashMap eChilds = new HashMap();
        TreeNode eNode = new TreeNode("e",eChilds);

        HashMap fChilds = new HashMap();
        TreeNode fNode = new TreeNode("f",fChilds);

        //建立结点联系
        rootChilds.put("a",aNode);
        rootChilds.put("b",bNode);
        rootChilds.put("g",gNode);

        aChilds.put("d",dNode);
        aChilds.put("c",cNode);

        bChilds.put("e",eNode);
        bChilds.put("f",fNode);
    }

    public List<String> listAllPathByRecursion(){
        //清空路径容器
        this.pathList.clear();
        listPath(this.root,"");
        return this.pathList;
    }

    public void listPath(TreeNode root,String path){

        if(root.getChilds().isEmpty()){// 叶子节点
            path = path + root.getContent();
            pathList.add(path); // 将结果保存在list中
            return;
        }else{ //非叶子节点
            path = path  + root.getContent() + "->";

            // 进行子节点的递归
            HashMap<String, TreeNode> childs = root.getChilds();
            Iterator iterator = childs.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry entry = (Map.Entry)iterator.next();
                TreeNode childNode  = (TreeNode) entry.getValue();
                listPath(childNode,path);
            }
        }
    }
}
