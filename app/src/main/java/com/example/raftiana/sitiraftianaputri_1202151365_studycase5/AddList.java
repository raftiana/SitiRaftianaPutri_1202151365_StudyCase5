package com.example.raftiana.sitiraftianaputri_1202151365_studycase5;

/**
 * Created by Raftiana on 25/03/2018.
 */

public class AddList {
    //deklarasi variable
    String todo, desc, prior;

    //konstruktor
    public AddList(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}
