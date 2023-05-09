package org.example.command;

import org.example.entities.CollectionController;
import org.example.exception.ValidException;

public class AddCommand implements Command {
    private CollectionController cc;
    private String param;

    public AddCommand(CollectionController cc) {
        this.cc = cc;
    }

    public AddCommand(String param, CollectionController cc) {
        this.cc = cc;
        this.param = param;
    }

    @Override
    public void execute() throws ValidException {
        if (param != null) {
            cc.addNewHumanScript(param);
        } else {
            cc.addNewHuman();
        }
    }

    public String descr() {
        return "add - добавить новый элемент в коллекцию";
    }
}
